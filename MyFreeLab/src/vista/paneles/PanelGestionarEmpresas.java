/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.paneles;

import index.MyFreeLab;
import src.Recursos;

/**
 *
 * @author victo
 */
public class PanelGestionarEmpresas extends javax.swing.JPanel {

    /**
     * Creates new form p_mis_datos
     */
    public PanelGestionarEmpresas() {
        initComponents();
        this.setSize(Recursos.tamDialogModal );
        this.setPreferredSize(Recursos.tamDialogModal );
        bkgAside.setImgBackgroundEnabled(true);
        bkgAside.setImgBackgroundIn_Ex(true);
        bkgAside.setImgRutaInterno(Recursos.bkgAside );
        mtdEstablecerIdioma();
    }
    
    private void mtdEstablecerIdioma(){
        
        // * Etiquetas
        this.titulo1.setText(MyFreeLab.idioma.getProperty("panelGestionarEmpresa.etqTitulo"));
        this.eqtEmpresa.setText(MyFreeLab.idioma.getProperty("panelGestionarEmpresa.eqtEmpresa") );
        
        // * Campos (Placeholder)
        this.cmpEmpresa.setPlaceholder(MyFreeLab.idioma.getProperty("panelGestionarEmpresa.eqtEmpresa") );
        
        // * Botones
        this.btnCrear.setTexto(MyFreeLab.idioma.getProperty("panelGestionarEmpresa.btnCrear") );
        this.btnModificar.setTexto(MyFreeLab.idioma.getProperty("panelGestionarEmpresa.btnModificar") );
        this.btnBuscar.setTexto(MyFreeLab.idioma.getProperty("panelGestionarEmpresa.btnBuscar") );
        this.btnRemover.setTexto(MyFreeLab.idioma.getProperty("panelGestionarEmpresa.btnRemover") );
        
        
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
        titulo1 = new vista.componentes.etiqueta.Titulo();
        jPanel2 = new javax.swing.JPanel();
        eqtEmpresa = new vista.componentes.etiqueta.Etiqueta();
        btnModificar = new vista.componentes.boton.Boton();
        btnBuscar = new vista.componentes.boton.Boton();
        btnCrear = new vista.componentes.boton.Boton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpresas = new javax.swing.JTable();
        cmpEmpresa = new vista.componentes.campos.CampoTexto();
        btnRemover = new vista.componentes.boton.Boton();

        bkgAside.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout bkgAsideLayout = new javax.swing.GroupLayout(bkgAside);
        bkgAside.setLayout(bkgAsideLayout);
        bkgAsideLayout.setHorizontalGroup(
            bkgAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        bkgAsideLayout.setVerticalGroup(
            bkgAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("GESTIONAR EMPRESAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(MyFreeLab.idioma.getProperty("panelGestionarEmpresa.etqTituloPanel")));

        eqtEmpresa.setText("Nombre del empresa");

        btnModificar.setImgButtonType("warning");
        btnModificar.setTexto("Modificar");

        btnBuscar.setImgButtonType("info");
        btnBuscar.setTexto("Buscar");

        btnCrear.setImgButtonType("success");
        btnCrear.setTexto("Crear");

        tblEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Mario Molina", "Desconocido", "example@example.com", "000000000"}
            },
            new String [] {
                "Id", "Nombre", "Dirección", "Correo", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmpresas);
        if (tblEmpresas.getColumnModel().getColumnCount() > 0) {
            tblEmpresas.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblEmpresas.getColumnModel().getColumn(1).setPreferredWidth(160);
            tblEmpresas.getColumnModel().getColumn(2).setPreferredWidth(120);
            tblEmpresas.getColumnModel().getColumn(3).setPreferredWidth(120);
            tblEmpresas.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        cmpEmpresa.setComponenteDidireccional(eqtEmpresa);

        btnRemover.setImgButtonType("danger");
        btnRemover.setTexto("Remover");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(eqtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(339, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eqtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cmpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bkgAside, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bkgAside, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.componentes.jpanelbackground.JPanelBackground bkgAside;
    public vista.componentes.boton.Boton btnBuscar;
    public vista.componentes.boton.Boton btnCrear;
    public vista.componentes.boton.Boton btnModificar;
    public vista.componentes.boton.Boton btnRemover;
    public vista.componentes.campos.CampoTexto cmpEmpresa;
    private vista.componentes.etiqueta.Etiqueta eqtEmpresa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblEmpresas;
    private vista.componentes.etiqueta.Titulo titulo1;
    // End of variables declaration//GEN-END:variables
}
