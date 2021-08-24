/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.paneles;

import index.MyFreeLab;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;
import src.Recursos;

/**
 *
 * @author victo
 */
public class PanelConexion extends javax.swing.JPanel {

    /**
     * Creates new form p_conexion
     */
    public PanelConexion() {
        initComponents();
        this.setSize(Recursos.tamDialogModal );
        this.setPreferredSize(Recursos.tamDialogModal );
        bkgAside.setImgBackgroundEnabled(true);
        bkgAside.setImgBackgroundIn_Ex(true);
        bkgAside.setImgRutaInterno(Recursos.bkgAside );
        mtdEstablecerIdioma();
        
        // Establecer evento de teclado para el chechkbox
        cmpNull.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
             
                if( cmpNull.isEnabled() ){
                    // Si el checkbox para el NULL es seleccionado
                    if( cmpNull.isSelected() ){
                        // * Deshabilitar el campo contraseña 
                        cmpContrasenha.setText(null);
                        cmpContrasenha.aceptarCampo();
                        cmpContrasenha.setEditable(false);
                        cmpContrasenha.setEnabled(false);
                        cmpContrasenha.setFocusable(false);
                    }else{
                        // * Deshabilitar el campo contraseña
                        cmpContrasenha.rechazarCampo();
                        cmpContrasenha.setEditable(true);
                        cmpContrasenha.setEnabled(true);
                        cmpContrasenha.setFocusable(true);
                    }
                }
            }
        });
        
    }
    
    private void mtdEstablecerIdioma(){
        // * Etiquetas
        this.etqUsuario.setText(MyFreeLab.idioma.getProperty("panelConexion.etqUsuario"));
        this.etqContrasenha.setText(MyFreeLab.idioma.getProperty("panelConexion.etqContrasenha"));
        this.etqDatabase.setText(MyFreeLab.idioma.getProperty("panelConexion.etqDatabase"));
        this.etqHost.setText(MyFreeLab.idioma.getProperty("panelConexion.etqHost"));
        this.etqPuerto.setText(MyFreeLab.idioma.getProperty("panelConexion.etqPuerto"));
        this.etqTitulo.setText(MyFreeLab.idioma.getProperty("panelConexion.etqTitulo"));
        this.etqOpcAvanzadas.setText(MyFreeLab.idioma.getProperty("panelConexion.etqOpcAvanzadas"));
        this.etqCrearBaseDatos.setText(MyFreeLab.idioma.getProperty("panelConexion.etqCrearBaseDatos"));
        this.etqUsarSSL.setText(MyFreeLab.idioma.getProperty("panelConexion.etqUsarSSL"));
        
        // * Campos (Placeholder)
        this.cmpUsuario.setPlaceholder(MyFreeLab.idioma.getProperty("panelConexion.etqUsuario"));
        this.cmpContrasenha.setPlaceholder(MyFreeLab.idioma.getProperty("panelConexion.etqContrasenha"));
        this.cmpDatabase.setPlaceholder(MyFreeLab.idioma.getProperty("panelConexion.etqDatabase"));
        this.cmpHost.setPlaceholder(MyFreeLab.idioma.getProperty("panelConexion.etqHost"));
        this.cmpPuerto.setPlaceholder(MyFreeLab.idioma.getProperty("panelConexion.etqPuerto"));
        
        // Botones
        this.btnEstablecerConexion.setTexto(MyFreeLab.idioma.getProperty("panelConexion.btnEstablecerConexion"));
        this.btnCerrarConexion.setTexto(MyFreeLab.idioma.getProperty("panelConexion.btnCerrarConexion"));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bkgAside = new vista.componentes.jpanelbackground.JPanelBackground();
        jPanel1 = new javax.swing.JPanel();
        etqTitulo = new vista.componentes.etiqueta.Titulo();
        jPanel2 = new javax.swing.JPanel();
        etqHost = new vista.componentes.etiqueta.Etiqueta();
        cmpHost = new vista.componentes.campos.CampoTexto();
        etqUsuario = new vista.componentes.etiqueta.Etiqueta();
        cmpUsuario = new vista.componentes.campos.CampoTexto();
        etqPuerto = new vista.componentes.etiqueta.Etiqueta();
        etqContrasenha = new vista.componentes.etiqueta.Etiqueta();
        etqDatabase = new vista.componentes.etiqueta.Etiqueta();
        cmpDatabase = new vista.componentes.campos.CampoTexto();
        cmpNull = new javax.swing.JCheckBox();
        cmpContrasenha = new vista.componentes.campos.CampoPassword();
        cmpPuerto = new vista.componentes.campos.CampoNumerico();
        bckgPanel = new vista.componentes.jpanelbackground.JPanelBackground();
        etqUsarSSL = new vista.componentes.etiqueta.Etiqueta();
        cmpUseSSL = new javax.swing.JCheckBox();
        etqCrearBaseDatos = new vista.componentes.etiqueta.Etiqueta();
        etqOpcAvanzadas = new vista.componentes.etiqueta.Mensaje();
        cmpCrearBaseDatos = new javax.swing.JCheckBox();
        btnEstablecerConexion = new vista.componentes.boton.Boton();
        btnCerrarConexion = new vista.componentes.boton.Boton();

        bkgAside.setBackground(new java.awt.Color(102, 102, 102));
        bkgAside.setImgBackgroundEnabled(true);
        bkgAside.setImgBackgroundIn_Ex(true);
        bkgAside.setImgRutaExterno(null);
        bkgAside.setImgRutaInterno("<Not Set>");

        javax.swing.GroupLayout bkgAsideLayout = new javax.swing.GroupLayout(bkgAside);
        bkgAside.setLayout(bkgAsideLayout);
        bkgAsideLayout.setHorizontalGroup(
            bkgAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        bkgAsideLayout.setVerticalGroup(
            bkgAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("CONFIGURAR LA CONEXION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(MyFreeLab.idioma.getProperty("panelConexion.etqTituloPanel")));

        etqHost.setText("Introduzca el host");

        cmpHost.setComponenteDidireccional(etqHost);

        etqUsuario.setText("Introduzca el usuario");

        cmpUsuario.setComponenteDidireccional(etqUsuario);

        etqPuerto.setText("Introduzca el puerto");

        etqContrasenha.setText("Introduzca la contraseña");

        etqDatabase.setText("Introduzca la base de datos");

        cmpDatabase.setComponenteDidireccional(etqDatabase);

        cmpNull.setText("Null");

        cmpContrasenha.setComponenteDidireccional(etqContrasenha);

        cmpPuerto.setComponenteDidireccional(etqPuerto);

        bckgPanel.setImgBackgroundEnabled(true);
        bckgPanel.setImgBackgroundIn_Ex(true);

        javax.swing.GroupLayout bckgPanelLayout = new javax.swing.GroupLayout(bckgPanel);
        bckgPanel.setLayout(bckgPanelLayout);
        bckgPanelLayout.setHorizontalGroup(
            bckgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        bckgPanelLayout.setVerticalGroup(
            bckgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        etqUsarSSL.setText("Usar SSL");

        etqCrearBaseDatos.setText("Crear Base de Datos");

        etqOpcAvanzadas.setText("Opciones avanzadas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etqOpcAvanzadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(197, 197, 197))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etqUsarSSL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqCrearBaseDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmpUseSSL)
                                    .addComponent(cmpCrearBaseDatos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(bckgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmpUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(cmpHost, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(etqHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmpDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(etqDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(etqContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmpNull))
                            .addComponent(cmpContrasenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqPuerto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpPuerto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cmpHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpNull)
                            .addComponent(etqHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(cmpContrasenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bckgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(etqDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(etqOpcAvanzadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etqUsarSSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(etqCrearBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmpUseSSL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmpCrearBaseDatos)))
                        .addGap(26, 26, 26))))
        );

        btnEstablecerConexion.setImgButtonType("success");
        btnEstablecerConexion.setTexto("Establecer conexión");

        btnCerrarConexion.setImgButtonType("danger");
        btnCerrarConexion.setTexto("Cerrar conexión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bkgAside, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstablecerConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrarConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bkgAside, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEstablecerConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public vista.componentes.jpanelbackground.JPanelBackground bckgPanel;
    public vista.componentes.jpanelbackground.JPanelBackground bkgAside;
    public vista.componentes.boton.Boton btnCerrarConexion;
    public vista.componentes.boton.Boton btnEstablecerConexion;
    public vista.componentes.campos.CampoPassword cmpContrasenha;
    public javax.swing.JCheckBox cmpCrearBaseDatos;
    public vista.componentes.campos.CampoTexto cmpDatabase;
    public vista.componentes.campos.CampoTexto cmpHost;
    public javax.swing.JCheckBox cmpNull;
    public vista.componentes.campos.CampoNumerico cmpPuerto;
    public javax.swing.JCheckBox cmpUseSSL;
    public vista.componentes.campos.CampoTexto cmpUsuario;
    public vista.componentes.etiqueta.Etiqueta etqContrasenha;
    private vista.componentes.etiqueta.Etiqueta etqCrearBaseDatos;
    public vista.componentes.etiqueta.Etiqueta etqDatabase;
    public vista.componentes.etiqueta.Etiqueta etqHost;
    private vista.componentes.etiqueta.Mensaje etqOpcAvanzadas;
    public vista.componentes.etiqueta.Etiqueta etqPuerto;
    private vista.componentes.etiqueta.Titulo etqTitulo;
    private vista.componentes.etiqueta.Etiqueta etqUsarSSL;
    public vista.componentes.etiqueta.Etiqueta etqUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
