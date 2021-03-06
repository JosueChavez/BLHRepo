/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AcercaDe.java
 *
 * Created on 01-may-2012, 8:56:40
 */
package vistas;

import Instancia.InstanceOf;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Chavez Vigil
 */
public class AcercaDe extends javax.swing.JFrame {

    /** Creates new form AcercaDe */
    public AcercaDe() {
        initComponents();
    }
      @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconBLH.png"));
        return retValue;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de - Banco de Leche Humana");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(255, 102, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Witcoo BLH, Todos los derechos reservados 2012");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 20, 380, 60);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setForeground(new java.awt.Color(204, 255, 255));
        jLabel15.setText("witcco@gmail.com");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(260, 90, 170, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel19.setForeground(new java.awt.Color(204, 255, 255));
        jLabel19.setText("Desarrolladores Witcco ");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(30, 90, 200, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Desarrolladores:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 190, 112, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/ues.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(420, 280, 140, 190);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel16.setForeground(new java.awt.Color(204, 255, 255));
        jLabel16.setText("jdoa207@hotmail.com");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(270, 230, 240, 17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel18.setForeground(new java.awt.Color(204, 255, 255));
        jLabel18.setText("Josué Daniel Orellana Aguirre");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(30, 230, 200, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Luis Josué Chávez Vigil");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 270, 170, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Erick Stanley Cruz Matínez");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 310, 190, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel17.setForeground(new java.awt.Color(204, 255, 255));
        jLabel17.setText("cobaincv.21@gmail.com");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(270, 270, 240, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DISEÑO DE SISTEMAS 2012");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(30, 420, 220, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("escm.1990@gmail.com");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(270, 310, 240, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Catedrático: Ing. Ernesto Alexander Calderón Peraza");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 440, 322, 15);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("UES FMOcc");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(30, 400, 270, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/w2.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(430, 50, 130, 184);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondo2.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, -10, 610, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-590)/2, (screenSize.height-515)/2, 590, 515);
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
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AcercaDe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
