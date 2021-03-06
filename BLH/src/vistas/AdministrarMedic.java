/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdministrarMedico.java
 *
 * Created on 12-jun-2012, 0:54:13
 */
package vistas;

import Instancia.InstanceOfConsult;
import Instancia.InstanceOf;
import Operaciones.OperacionesReportes;
import accesoDatos.Operaciones;
import accesoDatos.OperacionesUsuarios;
import clases.Medico;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chavez Vigil
 */
public class AdministrarMedic extends javax.swing.JFrame {

    /** Creates new form AdministrarMedico */
    Operaciones op = new Operaciones();
    OperacionesReportes opr = new OperacionesReportes();
    OperacionesUsuarios opU = new OperacionesUsuarios();
    String usu = "";
    public int filaAnterior = 0;
    RutaRecDomiciliar recoleccion = new RutaRecDomiciliar();
    static public String carnet = "";
    static public String fechaNac = "";
    static public double peso = 0.0;
    static public double estatura = 0.0;
    static public double pCefalico = 0.0;
    static public String notas = "";
    static public String conSalud = "";
    static public String racion = "";

    public AdministrarMedic() {
        initComponents();
        op.listarMedicos(jtMedicos);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMedicos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbAgregarMedico = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jlIndiceOculto1 = new javax.swing.JLabel();
        jlIndiceOculto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiImprimir = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Médicos - Banco de Leche Humana");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(701, 505));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(142, 180, 227));

        jtMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JVPM", "Nombre", "Apellido", "Especialidad"
            }
        ));
        jtMedicos.setRowHeight(25);
        jtMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMedicosMouseClicked(evt);
            }
        });
        jtMedicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMedicosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMedicosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtMedicos);

        jPanel2.setBackground(new java.awt.Color(142, 180, 227));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N
        net.java.dev.koalalayout.KoalaLayout koalaLayout1 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout1.setGridheight(10);
        koalaLayout1.setGridwidth(10);
        jPanel2.setLayout(koalaLayout1);

        jbAgregarMedico.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbAgregarMedico.setText("Nuevo Médico");
        jbAgregarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarMedicoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbAgregarMedico, gridBagConstraints);

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbGuardar, gridBagConstraints);

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEliminar.setText("Eliminar Médico");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbEliminar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        jPanel2.add(jlIndiceOculto1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        jPanel2.add(jlIndiceOculto, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(142, 180, 227));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbAgregar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jMenu1.setText("Archivo");

        jmiImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmiImprimir.setText("Imprimir");
        jmiImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiImprimir);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-717)/2, (screenSize.height-543)/2, 717, 543);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarMedicoActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) jtMedicos.getModel();
            Object fila[] = {"", "", "", ""};
            model.addRow(fila);
            this.jbAgregarMedico.setEnabled(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbAgregarMedicoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:

        try {
            if (jtMedicos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "¡Seleccione Medico para Almacenar!");
            } else if (jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 0).equals("") || jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 1).equals("") || jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 2).equals("") || jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 3).equals("")) {
                JOptionPane.showMessageDialog(rootPane, "¡Por favor, complete datos del Medico!");
            } else {
                Medico doc = new Medico((Integer.parseInt(jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 0).toString())), jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 1).toString(), jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 2).toString(), jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 3).toString());
                op.almacenarMedico(doc);
                this.jbAgregarMedico.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al almacenar: " + e.getMessage());
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
    try {
        if (jtMedicos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Médico");
        } else {
            try {
                comoSalir();
                RutaRecDomiciliar.jbModificar.setVisible(false);
                RutaRecDomiciliar.jbEliminar.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
            }
        }
    } catch (Exception e) {
    }
}//GEN-LAST:event_jbAgregarActionPerformed

    public void comoSalir() {
        int var = Integer.parseInt(jlIndiceOculto.getText());
        switch (var) {
            case 1:
                this.hide();
                break;
            case 2:
                new Consult().setVisible(true);
                Consult.jtfMedico.setText(this.jtMedicos.getValueAt(this.jtMedicos.getSelectedRow(), 0).toString());
                Consult.jlCarnet.setText(carnet);
                Consult.jlFechaNac.setText(fechaNac);
                Consult.jsPeso.setValue(peso);
                Consult.jsEstatura.setValue(estatura);
                Consult.jsPerimetroCefalico.setValue(pCefalico);
                Consult.jtfDiagnostico.setText(notas);
                Consult.jtfRacionAsignada.setText(racion);
                this.setVisible(false);
                break;
            case 3:
                new InstanceOf().rutRecDom.setVisible(true);
                RutaRecDomiciliar.jtfMedico.setText(this.jtMedicos.getValueAt(this.jtMedicos.getSelectedRow(), 0).toString());
                RutaRecDomiciliar.jlIndiceOc.setText(jlIndiceOculto1.getText());
                this.hide();
                break;

        }
    }

    public void comoSalir2() {
        int var = Integer.parseInt(jlIndiceOculto.getText());
        switch (var) {
            case 1:
                this.setVisible(false);
                break;
            case 2:
                new Consult().setVisible(true);
                Consult.jtfMedico.setText(this.jtMedicos.getValueAt(this.jtMedicos.getSelectedRow(), 0).toString());
                Consult.jlCarnet.setText(carnet);
                Consult.jlFechaNac.setText(fechaNac);
                Consult.jsPeso.setValue(peso);
                Consult.jsEstatura.setValue(estatura);
                Consult.jsPerimetroCefalico.setValue(pCefalico);
                Consult.jtfDiagnostico.setText(notas);
                Consult.jtfRacionAsignada.setText(racion);
                this.setVisible(false);
                break;
            case 3:
                recoleccion.medico = "";
                new InstanceOf().rutRecDom.setVisible(true);
                RutaRecDomiciliar.jlIndiceOc.setText(jlIndiceOculto1.getText());
                this.setVisible(false);
                break;
        }
    }
private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
    comoSalir2();
}//GEN-LAST:event_jbCancelarActionPerformed

private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    comoSalir2();
}//GEN-LAST:event_formWindowClosed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        try {
            if (jtMedicos.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "¡Seleccione Medico a Eliminar!");
            } else {
                int msj = JOptionPane.showConfirmDialog(rootPane, "¿En verdad desea eliminar?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (msj == 0) {
                    if (opU.isAdmin()) {
                        usu = opU.usuarioUp();
                        opU.setEstado(usu, "El. medico " + jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 0).toString());
                        Medico doc = new Medico((Integer.parseInt(jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 0).toString())), jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 1).toString(), jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 2).toString(), jtMedicos.getValueAt(jtMedicos.getSelectedRow(), 3).toString());
                        op.eliminarMedico(doc);
                        DefaultTableModel model = (DefaultTableModel) jtMedicos.getModel();
                        model.removeRow(jtMedicos.getSelectedRow());
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo siento, usted no esta autorizado para realizar esta acción\nsolo un administrador puede hacerlo", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jmiImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiImprimirActionPerformed
        // TODO add your handling code here
        String archivo = System.getProperty("user.dir");
        archivo = archivo + "\\src\\reportes\\banner.png";
        opr.runReporte("ListaMedicos", archivo);
    }//GEN-LAST:event_jmiImprimirActionPerformed

private void jtMedicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMedicosKeyPressed
    filaAnterior = jtMedicos.getSelectedRow();
}//GEN-LAST:event_jtMedicosKeyPressed

private void jtMedicosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMedicosKeyReleased
    try {
        int key = evt.getKeyChar();

        System.out.println("FILA: " + filaAnterior);
        if (key == KeyEvent.VK_TAB && !jtMedicos.getValueAt(filaAnterior, 0).equals("") && !jtMedicos.getValueAt(filaAnterior, 1).equals("") && !jtMedicos.getValueAt(filaAnterior, 2).equals("") && !jtMedicos.getValueAt(filaAnterior, 3).equals("")) {
            Medico doc = new Medico(Integer.parseInt(jtMedicos.getValueAt(filaAnterior, 0).toString()), jtMedicos.getValueAt(filaAnterior, 1).toString(), jtMedicos.getValueAt(filaAnterior, 2).toString(), jtMedicos.getValueAt(filaAnterior, 3).toString());
            op.almacenarMedico(doc);
            this.jbAgregarMedico.setEnabled(true);
        }
    } catch (Exception e) {
    }
}//GEN-LAST:event_jtMedicosKeyReleased

private void jtMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMedicosMouseClicked
    filaAnterior = jtMedicos.getSelectedRow();

}//GEN-LAST:event_jtMedicosMouseClicked

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
            java.util.logging.Logger.getLogger(AdministrarMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarMedic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AdministrarMedic().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAgregarMedico;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    public static javax.swing.JLabel jlIndiceOculto;
    public static javax.swing.JLabel jlIndiceOculto1;
    private javax.swing.JMenuItem jmiImprimir;
    private javax.swing.JTable jtMedicos;
    // End of variables declaration//GEN-END:variables
}
