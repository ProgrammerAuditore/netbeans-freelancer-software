package controlador;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.in;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import modelo.ObjVersionesXml;
import src.Info;
import src.Source;
import vista.paneles.PanelActualizacion;

public class ctrlBuscarActualizacion implements MouseListener {

    // * Vista
    public JDialog modal;
    private PanelActualizacion laVista;

    // * Modelo
    private ObjVersionesXml objDocXml;

    public ctrlBuscarActualizacion(PanelActualizacion laVista, ObjVersionesXml modelo) {
        this.laVista = laVista;
        this.objDocXml = modelo;

        // * Establecer oyentes
        this.laVista.btnBuscar.addMouseListener(this);

    }

    public void init() {
        mtdEstablecerDatosDelProgramaActual();

        // * Establecer propiedades para la modal
        modal.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        modal.setTitle("Buscar actualizacion");
        modal.setResizable(false);
        modal.setSize( laVista.getSize() );
        modal.setPreferredSize( laVista.getSize() );
        modal.setContentPane(laVista);
        
        modal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                modal.setVisible(false);
                modal.dispose();
                //System.out.println("Cerrando PanelActualizacion");
            }

            @Override
            public void windowOpened(WindowEvent e) {
                
                Runnable verificar = () -> {
                    
                    try { Thread.sleep(450); } catch (InterruptedException ex) {}
                    mtdBuscarActualizacion();
                    
                };
                
                Thread HiloBuscarActualizacion =  new Thread(verificar);
                HiloBuscarActualizacion.setName("HiloBuscarActualizacion");
                HiloBuscarActualizacion.setPriority(9);
                HiloBuscarActualizacion.run();
                
            }

        });

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        if (e.getSource() == laVista.btnBuscar) {
            if (laVista.btnBuscar.isEnabled()) {
                mtdBuscarActualizacion();
            }
        }

    }

    private void mtdBuscarActualizacion() {

        String path = Source.dirTemp;
        // Verificar el sistema operativo
        path += Source.OsWin ? "" : "/" ;
        path += "myfreelab-" + Source.timeTmp + ".mfl";
        String url = "https://gitlab.com/ProgrammerAuditore/storege-mfl/-/raw/master/MyFreeLab.mfl?inline=false";
        File archivo = new File(path);
        objDocXml.setArchivoXml(archivo);
        objDocXml.setPath_archivo(path);
        
        // * Descargar el archivo XML
        if (mtdDescargaURL(url, path)) {

            if (archivo.exists())
                ProcesoDeActualizacion();
            
        }
        
    }
    
    private void ProcesoDeActualizacion(){
        HashMap<String, String> doc = objDocXml.mtdMapearUltimaVersion();

        // * Verificar versiones
        int versionNum = Integer.parseInt( doc.get("app_num_version") );
        if ( versionNum > Integer.parseInt(Info.sVersionNum) ) {

            // * Actualizar el programa
            // * Establecer informacion de la nueva version
            laVista.etqVersionActual.setText("Nueva version");
            laVista.cmpVersionActual.setText(doc.get("app_name_version"));
            laVista.cmpNovedades.setText(doc.get("app_novedades"));

            laVista.cmpVersionActual.setBorder(new LineBorder(Color.green));
            laVista.cmpNovedades.setBorder(new LineBorder(Color.green));

            int resp = JOptionPane.showConfirmDialog(null,
                    "Existe una nueva version del programa\n¿Deseas descargarlo e instalarlo?",
                    "Descargar e instalar", JOptionPane.YES_NO_OPTION);

            if (resp == JOptionPane.YES_OPTION) {

                // Verificar el sistema operativo
                if ( Source.OsWin ) {
                    System.out.println("Link de descargar :: " + doc.get("app_link_exe"));
                    mtdInstalarActualizacionExe( doc.get("app_link_exe") , versionNum );

                } else  {
                    System.out.println("Link de descargar :: " + doc.get("app_link_deb"));
                    mtdInstalarActualizacionDeb( doc.get("app_link_deb"), versionNum );

                }

            } else mtdEstablecerDatosDelProgramaActual();


        // * Verificar si la version es identico
        } else if( versionNum == Integer.parseInt(Info.sVersionNum)  ){
            JOptionPane.showMessageDialog(null, Info.NombreSoftware + " es la versión más reciente.");
        }
    }

    private void mtdInstalarActualizacionDeb(String url, int versionNum) {
        String fileName;
        fileName = Source.dirTemp + "/" + "myfreelab-" + versionNum + ".deb";
        File archivo = new File(fileName);
        //System.out.println("Ejecutable deb :: " + path);

        if( !archivo.exists() ){
            if (mtdDescargaURL(url, fileName)) {
                System.out.println("#Paquete descargado : " + fileName );
            }
        }
        
        try {
            // Se procede su instalacion
            String dir = archivo.getCanonicalPath();
            String cmd = "qapt-deb-installer " + fileName;
            Runtime run = Runtime.getRuntime();
            Process pr = run.exec(cmd);

        } catch (IOException ex) {}

        System.exit(0);
    }
    
    private void mtdInstalarActualizacionExe(String url, int versionNum) {
        String fileName;
        fileName = Source.dirTemp + "myfreelab-" + versionNum + ".exe";
        File archivo = new File(fileName);
        //System.out.println("Ejecutable exe :: " + path);

        if( !archivo.exists() ){
            if (mtdDescargaURL(url, fileName)){
                System.out.println("#Ejecutable descargado : " + fileName );
            }
        }
        
        // * Procede a instalarlo
        // * Obtener el path de desinstalador  
        modal.getParent().setVisible(false);
        String directorioActual = new File(".").getAbsolutePath().replace(".", "");
        String desinstalador_path = directorioActual + "unins000.exe";
        File desinstalador = new File(desinstalador_path);

        // * Desinstalar la version actual
        //if( mtdProcesoDeDesInstalacionWin(desinstalador) ){
            // Instalar la version nueva
            if ( archivo.exists()  ) {
                try {
                    String dir = archivo.getCanonicalPath();
                    String cmd = "cmd /c start " + fileName + "";
                    Runtime run = Runtime.getRuntime();
                    Process pr = run.exec(cmd);

                } catch (IOException ex) {
                    Logger.getLogger(ctrlBuscarActualizacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 

        //}
            
        System.exit(0);
    }
    
    public boolean mtdProcesoDeDesInstalacionWin(File desinstalador){
        try {
            
            if( desinstalador.exists() ){
                //Desktop desktop = Desktop.getDesktop();
                //Desktop.open(new File(desinstalador.toURI()));
                ProcessBuilder p = new ProcessBuilder(desinstalador.getAbsolutePath());
                p.start();
                //Runtime run = Runtime.getRuntime();
                //Process pr = run.exec(desinstalador.getAbsolutePath());
            }
            
            return true;
        } catch (IOException ex) {
                Logger.getLogger(ctrlBuscarActualizacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    public boolean mtdDescargaURL(String FILE_URL, String FILE_NAME) {
        try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            // handle exception
            JOptionPane.showMessageDialog(null, "No se pudo acceder al sitio oficial, error 404.");
            //System.out.println("" + e.getMessage());
        }

        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(ctrlBuscarActualizacion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (new File(FILE_NAME).exists());
    }
    
    private void mtdEstablecerDatosDelProgramaActual(){
        
        // * Cambiar estilo de los campos
        laVista.etqVersionActual.setText("Version actualmente");
        laVista.cmpVersionActual.setBorder(null);
        laVista.cmpNovedades.setBorder(null);
        
        // * Establecer los datos
        laVista.cmpVersionActual.setText(Info.sVersionName + Info.sProduccion);
        laVista.cmpNovedades.setText(Info.Novedades);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
