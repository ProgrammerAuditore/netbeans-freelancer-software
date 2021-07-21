/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.ventanas;

import index.MyFreeLab;
import src.Source;

/**
 *
 * @author victor
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        // * Convertir en transparente el contendor de proyectos
        this.pnlContenedor.setOpaque(false);
        this.scpContenedor.setOpaque(false);
        this.scpContenedor.getViewport().setOpaque(false);
        
        // * Eliminar los bordes del contendor de proyectos
        this.pnlContenedor.setBorder(null);
        this.scpContenedor.setBorder(null);
        this.scpContenedor.getViewport().setBorder(null);
        
        // * Establecer la velocidad del scroll
        this.scpContenedor.getVerticalScrollBar().setUnitIncrement(16);
        
        // * Establece logo
        this.pnlLogo.setImgBackgroundEnabled(true);
        this.pnlLogo.setImgRutaInternoActivo(true);
        this.pnlLogo.setImgRutaInterno(Source.bkgPortada);
        
        // * Establece portada
        //this.pnlPortada.setImgBackgroundEnabled(true);
        //this.pnlPortada.setImgRutaInternoActivo(true);
        //this.pnlPortada.setImgRutaInterno(Source.bkgPortada);
        
        mtdEstablecerIdioma();
    }
    
    private void mtdEstablecerIdioma(){
        // * Menus
        this.menuArchivo.setText(MyFreeLab.idioma.getProperty("Archivo") );
        this.menuAyuda.setText(MyFreeLab.idioma.getProperty("Ayuda"));
        this.menuEditar.setText(MyFreeLab.idioma.getProperty("Editar"));
        this.menuConfigurar.setText(MyFreeLab.idioma.getProperty("Configurar"));
        
        // * Etiquetas
        this.etqFiltroProEnProceso.setText(MyFreeLab.idioma.getProperty("etq.FiltroProEnProceso"));
        this.etqFiltroProRealizados.setText(MyFreeLab.idioma.getProperty("etq.FiltroProRealizados"));
        this.etqFiltroProEliminados.setText(MyFreeLab.idioma.getProperty("etq.FiltroProEliminados"));
        
        // * Botones
        this.btnSalir.setText(MyFreeLab.idioma.getProperty("btn.Salir"));
        this.btnPreferencias.setText(MyFreeLab.idioma.getProperty("btn.Preferencia"));
        
        this.btnDatosPersonales.setText(MyFreeLab.idioma.getProperty("btn.DatosPersonales"));
        this.btnGestionarProyectos.setText(MyFreeLab.idioma.getProperty("btn.GestionarProyectos"));
        this.btnGestionarEmpresas.setText(MyFreeLab.idioma.getProperty("btn.GestionarEmpresas"));
        this.btnVinculacion.setText(MyFreeLab.idioma.getProperty("btn.Vinculacion"));
        
        this.btnConexion.setText(MyFreeLab.idioma.getProperty("btn.Conexion"));
        
        this.btnObtenerAyuda.setText(MyFreeLab.idioma.getProperty("btn.ObtenerAyuda"));
        this.btnActualizarPrograma.setText(MyFreeLab.idioma.getProperty("btn.ActualizarPrograma"));
        this.btnAcercaDe.setText(MyFreeLab.idioma.getProperty("btn.AcercaDe"));
        
        // * Establecer placeholder
        this.cmpBusqueda.setPlaceholder(MyFreeLab.idioma.getProperty("msg.CampoBusqueda"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        cmpEmpresas = new javax.swing.JLabel();
        cmpProyectos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etqPaginacion = new javax.swing.JLabel();
        scpContenedor = new javax.swing.JScrollPane();
        pnlContenedor = new javax.swing.JPanel();
        pnlOpciones = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        checkProEliminados = new javax.swing.JCheckBox();
        etqFiltroProEliminados = new vista.componentes.etiqueta.Etiqueta();
        jPanel4 = new javax.swing.JPanel();
        checkProRealizados = new javax.swing.JCheckBox();
        etqFiltroProRealizados = new vista.componentes.etiqueta.Etiqueta();
        jPanel5 = new javax.swing.JPanel();
        checkProEnProceso = new javax.swing.JCheckBox();
        etqFiltroProEnProceso = new vista.componentes.etiqueta.Etiqueta();
        pnlLogo = new vista.componentes.jpanelbackground.JPanelBackground();
        cmpBusqueda = new vista.componentes.campos.CampoTexto();
        jPanel3 = new javax.swing.JPanel();
        etqMensaje = new vista.componentes.etiqueta.Mensaje();
        panelPaginacion = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        btnPreferencias = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnSalir = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        btnDatosPersonales = new javax.swing.JMenuItem();
        btnGestionarProyectos = new javax.swing.JMenuItem();
        btnGestionarEmpresas = new javax.swing.JMenuItem();
        btnVinculacion = new javax.swing.JMenuItem();
        menuConfigurar = new javax.swing.JMenu();
        btnConexion = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        btnObtenerAyuda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnActualizarPrograma = new javax.swing.JMenuItem();
        btnAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1204, 724));

        jToolBar1.setBackground(new java.awt.Color(153, 153, 153));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar1.setFloatable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cmpEmpresas.setText("Empresa : #");

        cmpProyectos.setText("Proyectos : #");

        jLabel1.setText("  |  ");

        etqPaginacion.setText("Pag. 100 / Pag. 100");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqPaginacion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                .addComponent(cmpProyectos)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmpEmpresas)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpEmpresas)
                    .addComponent(cmpProyectos)
                    .addComponent(jLabel1)
                    .addComponent(etqPaginacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1097, Short.MAX_VALUE)
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );

        scpContenedor.setViewportView(pnlContenedor);

        pnlOpciones.setBackground(new java.awt.Color(211, 211, 211));
        pnlOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(45, 52, 93));

        checkProEliminados.setBackground(new java.awt.Color(255, 255, 255));
        checkProEliminados.setAutoscrolls(true);
        checkProEliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProEliminadosActionPerformed(evt);
            }
        });

        etqFiltroProEliminados.setForeground(new java.awt.Color(255, 255, 255));
        etqFiltroProEliminados.setText(" Proyectos eliminados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(checkProEliminados)
                .addGap(26, 26, 26)
                .addComponent(etqFiltroProEliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkProEliminados, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(etqFiltroProEliminados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(45, 52, 93));

        checkProRealizados.setBackground(new java.awt.Color(255, 255, 255));
        checkProRealizados.setAutoscrolls(true);

        etqFiltroProRealizados.setForeground(new java.awt.Color(255, 255, 255));
        etqFiltroProRealizados.setText(" Proyectos realizados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(checkProRealizados)
                .addGap(26, 26, 26)
                .addComponent(etqFiltroProRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkProRealizados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(etqFiltroProRealizados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(45, 52, 93));

        checkProEnProceso.setBackground(new java.awt.Color(255, 255, 255));
        checkProEnProceso.setAutoscrolls(true);

        etqFiltroProEnProceso.setForeground(new java.awt.Color(255, 255, 255));
        etqFiltroProEnProceso.setText(" Proyectos en proceso");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(checkProEnProceso)
                .addGap(26, 26, 26)
                .addComponent(etqFiltroProEnProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etqFiltroProEnProceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkProEnProceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        cmpBusqueda.setText("campoTexto1");

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmpBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(cmpBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etqMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMensaje.setText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPaginacionLayout = new javax.swing.GroupLayout(panelPaginacion);
        panelPaginacion.setLayout(panelPaginacionLayout);
        panelPaginacionLayout.setHorizontalGroup(
            panelPaginacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPaginacionLayout.setVerticalGroup(
            panelPaginacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        menuArchivo.setText("Archivo");

        btnPreferencias.setText("Preferencias");
        menuArchivo.add(btnPreferencias);
        menuArchivo.add(jSeparator2);

        btnSalir.setText("Sallir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(btnSalir);

        menuBar.add(menuArchivo);

        menuEditar.setText("Editar");
        menuEditar.setEnabled(false);

        btnDatosPersonales.setIcon(new javax.swing.ImageIcon(getClass().getResource(Source.iconosContenedor + "icono_datospersonales.png"))); // NOI18N
        btnDatosPersonales.setText("Mis datos personales");
        menuEditar.add(btnDatosPersonales);

        btnGestionarProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource(Source.iconosContenedor +"icono_gproyectos.png"))); // NOI18N
        btnGestionarProyectos.setText("Gestionar proyectos");
        menuEditar.add(btnGestionarProyectos);

        btnGestionarEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource(Source.iconosContenedor + "icono_gempresas.png"))); // NOI18N
        btnGestionarEmpresas.setText("Gestionar empresas");
        menuEditar.add(btnGestionarEmpresas);

        btnVinculacion.setIcon(new javax.swing.ImageIcon(getClass().getResource(Source.iconosContenedor + "icono_pvinculacion.png"))); // NOI18N
        btnVinculacion.setText("Vinculación");
        menuEditar.add(btnVinculacion);

        menuBar.add(menuEditar);

        menuConfigurar.setText("Configurar");

        btnConexion.setIcon(new javax.swing.ImageIcon(getClass().getResource(Source.iconosContenedor + "icono_cbasededatos.png"))); // NOI18N
        btnConexion.setText("Conexión");
        menuConfigurar.add(btnConexion);

        menuBar.add(menuConfigurar);

        menuAyuda.setText("Ayuda");

        btnObtenerAyuda.setText("Obtener ayuda");
        menuAyuda.add(btnObtenerAyuda);
        menuAyuda.add(jSeparator1);

        btnActualizarPrograma.setText("Buscar actualización");
        menuAyuda.add(btnActualizarPrograma);

        btnAcercaDe.setText("Acerca de");
        menuAyuda.add(btnAcercaDe);

        menuBar.add(menuAyuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPaginacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(39, 39, 39)
                        .addComponent(panelPaginacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    }//GEN-LAST:event_btnSalirActionPerformed

    private void checkProEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProEliminadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkProEliminadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem btnAcercaDe;
    public javax.swing.JMenuItem btnActualizarPrograma;
    public javax.swing.JMenuItem btnConexion;
    public javax.swing.JMenuItem btnDatosPersonales;
    public javax.swing.JMenuItem btnGestionarEmpresas;
    public javax.swing.JMenuItem btnGestionarProyectos;
    public javax.swing.JMenuItem btnObtenerAyuda;
    public javax.swing.JMenuItem btnPreferencias;
    public javax.swing.JMenuItem btnSalir;
    public javax.swing.JMenuItem btnVinculacion;
    public javax.swing.JCheckBox checkProEliminados;
    public javax.swing.JCheckBox checkProEnProceso;
    public javax.swing.JCheckBox checkProRealizados;
    public vista.componentes.campos.CampoTexto cmpBusqueda;
    public static javax.swing.JLabel cmpEmpresas;
    public static javax.swing.JLabel cmpProyectos;
    private vista.componentes.etiqueta.Etiqueta etqFiltroProEliminados;
    private vista.componentes.etiqueta.Etiqueta etqFiltroProEnProceso;
    private vista.componentes.etiqueta.Etiqueta etqFiltroProRealizados;
    public static vista.componentes.etiqueta.Mensaje etqMensaje;
    public static javax.swing.JLabel etqPaginacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JMenu menuArchivo;
    public javax.swing.JMenu menuAyuda;
    public javax.swing.JMenuBar menuBar;
    public javax.swing.JMenu menuConfigurar;
    public javax.swing.JMenu menuEditar;
    public javax.swing.JPanel panelPaginacion;
    public javax.swing.JPanel pnlContenedor;
    private vista.componentes.jpanelbackground.JPanelBackground pnlLogo;
    private javax.swing.JPanel pnlOpciones;
    public javax.swing.JScrollPane scpContenedor;
    // End of variables declaration//GEN-END:variables
}
