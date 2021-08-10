/*
 * Copyright (C) 2021 max98
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package vista.splash;

import index.MyFreeLab;
import src.Info;
import src.Recursos;

/**
 *
 * @author max98
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        // [163,184,204]
        this.setUndecorated(true);
        initComponents();
        
        // * Establece propiedades
        this.etqCarga.setVisible(false);
        this.jPanelBackground1.setImgBackgroundEnabled(true);
        this.jPanelBackground1.setImgBackgroundIn_Ex(true);
        this.jPanelBackground1.setImgRutaInterno(Recursos.bkgSplash );
        
        // * Establace información del software
        this.etqSoftware.setText(Info.NombreSoftware);
        this.etqIdioma.setText(MyFreeLab.IdiomaDefinido);
        this.eqtCopyright.setText(MyFreeLab.idioma.getProperty("Splash.eqtCopyright"));
        
        // * Realiza los cambios
        pack();
        revalidate();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground1 = new vista.componentes.jpanelbackground.JPanelBackground();
        etqMensaje = new javax.swing.JLabel();
        pbProgreso = new javax.swing.JProgressBar();
        etqCarga = new vista.componentes.etiqueta.SubTitulo();
        eqtCopyright = new vista.componentes.etiqueta.Mensaje();
        etqIdioma = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        etqSoftware = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBackground1.setImgBackgroundEnabled(true);
        jPanelBackground1.setImgBackgroundIn_Ex(false);
        jPanelBackground1.setImgOpacidad(0.8F);
        jPanelBackground1.setImgRutaInterno(src.Recursos.bkgSplash);
        jPanelBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etqMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etqMensaje.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBackground1.add(etqMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 259, 311, 21));
        jPanelBackground1.add(pbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 286, 600, -1));

        etqCarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCarga.setText("100%");
        jPanelBackground1.add(etqCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 139, -1));

        eqtCopyright.setForeground(new java.awt.Color(255, 255, 255));
        eqtCopyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eqtCopyright.setText("Todo los derechos reservados.");
        jPanelBackground1.add(eqtCopyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 266, 180, -1));

        etqIdioma.setForeground(new java.awt.Color(255, 255, 255));
        etqIdioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqIdioma.setText("ESP");
        jPanelBackground1.add(etqIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 32, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Victor J. Maximo (c) 2021");
        jPanelBackground1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 180, -1));

        etqSoftware.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        etqSoftware.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        etqSoftware.setText("MyFreeLab vX.X.XProd");
        jPanelBackground1.add(etqSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 0, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.componentes.etiqueta.Mensaje eqtCopyright;
    public vista.componentes.etiqueta.SubTitulo etqCarga;
    private javax.swing.JLabel etqIdioma;
    public javax.swing.JLabel etqMensaje;
    private javax.swing.JLabel etqSoftware;
    private javax.swing.JLabel jLabel2;
    private vista.componentes.jpanelbackground.JPanelBackground jPanelBackground1;
    public javax.swing.JProgressBar pbProgreso;
    // End of variables declaration//GEN-END:variables
}
