/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OtrosDatos.java
 *
 * Created on 10-sep-2012, 21:08:59
 */
package vistas;

import accesoDatos.OperacionesConsulta;
import clases.Calculos;
import clases.PropiedadPaciente;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Chavez Vigil
 */
public class OtrosDatos extends javax.swing.JFrame {

    /** Creates new form OtrosDatos */
    Date fecha = null;
    double pesoNac = 0.0;
    double pesoInc = 0.0;
    double estNac = 0.0;
    double estInc = 0.0;
    double PCefNac = 0.0;
    double pCefInc = 0.0;
    PropiedadPaciente prop;
    static public String carnet = "";
    OperacionesConsulta op = new OperacionesConsulta();
    Calculos cal = new Calculos();

    public OtrosDatos() {
        initComponents();
        fecha = new Date(jcFecha.getDate().getTime());
        verificarPaciente(carnet);
        jtfEdadActual.setText(ControlPaciente.jlEdad.getText());
        Date fecha = new Date(jcFecha.getDate().getTime());
        jtfDiasPrograma.setText(cal.calcularDias(fecha));
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconBLH.png"));
        return retValue;
    }

    public void verificarPaciente(String carnet) {
        if (op.verificarPaciente(carnet) == true) {
            jcFecha.setDate(op.extraerPropiedad(carnet).getFechaIncorporacion());
            jsPesoNacer.setValue(op.extraerPropiedad(carnet).getPesoNacer());
            jsPesoIncorporarse.setValue(op.extraerPropiedad(carnet).getPesoIncorporarse());
            jsEstaturaNacer.setValue(op.extraerPropiedad(carnet).getEstaturaNacer());
            jsEstaturaIncorporarse.setValue(op.extraerPropiedad(carnet).getEstaturaIncorporarse());
            jsPerimetroCefalicoNacer.setValue(op.extraerPropiedad(carnet).getpCefalicoNacer());
            jsPerimetroCefalicoIncorporar.setValue(op.extraerPropiedad(carnet).getpCefalicoIncorporarse());
            jbAceptar.setEnabled(false);
        }
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcFecha = new org.freixas.jcalendar.JCalendarCombo();
        jLabel2 = new javax.swing.JLabel();
        jlEdadInicio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jsPesoNacer = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jsEstaturaNacer = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jsPerimetroCefalicoNacer = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jsPesoIncorporarse = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jsEstaturaIncorporarse = new javax.swing.JSpinner();
        jsPerimetroCefalicoIncorporar = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtfEdadActual = new javax.swing.JTextField();
        jtfRacionesAsignadas = new javax.swing.JTextField();
        jtfDiasPrograma = new javax.swing.JTextField();
        jtfPesoActual = new javax.swing.JTextField();
        jtfEstaturaActual = new javax.swing.JTextField();
        jtfPCefalicoActual = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jlCarnet = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Propiedades Pacientes - Banco de Leche Materna");
        setIconImage(getIconImage());

        net.java.dev.koalalayout.KoalaLayout koalaLayout1 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout1.setGridheight(30);
        koalaLayout1.setGridwidth(30);
        jPanel1.setLayout(koalaLayout1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        net.java.dev.koalalayout.KoalaLayout koalaLayout2 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout2.setGridheight(15);
        koalaLayout2.setGridwidth(15);
        jPanel2.setLayout(koalaLayout2);

        jLabel1.setText("Incorporación:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jLabel1, gridBagConstraints);

        jcFecha.addDateListener(new org.freixas.jcalendar.DateListener() {
            public void dateChanged(org.freixas.jcalendar.DateEvent evt) {
                jcFechaDateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jcFecha, gridBagConstraints);

        jLabel2.setText("Fecha de Nacimiento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        jPanel2.add(jLabel2, gridBagConstraints);

        jlEdadInicio.setFont(new java.awt.Font("Tahoma", 1, 14));
        jlEdadInicio.setForeground(new java.awt.Color(0, 0, 204));
        jlEdadInicio.setText("2 meses");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        jPanel2.add(jlEdadInicio, gridBagConstraints);

        jLabel6.setText("Peso al Nacer (gr):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        jPanel2.add(jLabel6, gridBagConstraints);

        jsPesoNacer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsPesoNacerStateChanged(evt);
            }
        });
        jsPesoNacer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsPesoNacerFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(jsPesoNacer, gridBagConstraints);

        jLabel8.setText("Estatura al Nacer (cm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 8;
        jPanel2.add(jLabel8, gridBagConstraints);

        jsEstaturaNacer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsEstaturaNacerStateChanged(evt);
            }
        });
        jsEstaturaNacer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsEstaturaNacerFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(jsEstaturaNacer, gridBagConstraints);

        jLabel5.setText("Per. cefálico al Nacer (cm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 8;
        jPanel2.add(jLabel5, gridBagConstraints);

        jsPerimetroCefalicoNacer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsPerimetroCefalicoNacerStateChanged(evt);
            }
        });
        jsPerimetroCefalicoNacer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsPerimetroCefalicoNacerFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(jsPerimetroCefalicoNacer, gridBagConstraints);

        jLabel7.setText("Peso al Incorporarse  (gr):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        jPanel2.add(jLabel7, gridBagConstraints);

        jsPesoIncorporarse.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsPesoIncorporarseStateChanged(evt);
            }
        });
        jsPesoIncorporarse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsPesoIncorporarseFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(jsPesoIncorporarse, gridBagConstraints);

        jLabel9.setText("Estatura al Incorporarse (cm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 8;
        jPanel2.add(jLabel9, gridBagConstraints);

        jsEstaturaIncorporarse.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsEstaturaIncorporarseStateChanged(evt);
            }
        });
        jsEstaturaIncorporarse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsEstaturaIncorporarseFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(jsEstaturaIncorporarse, gridBagConstraints);

        jsPerimetroCefalicoIncorporar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsPerimetroCefalicoIncorporarStateChanged(evt);
            }
        });
        jsPerimetroCefalicoIncorporar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsPerimetroCefalicoIncorporarFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 4;
        jPanel2.add(jsPerimetroCefalicoIncorporar, gridBagConstraints);

        jLabel10.setText("Per. cefálico al Incorporarse (cm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 9;
        jPanel2.add(jLabel10, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.gridheight = 30;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        net.java.dev.koalalayout.KoalaLayout koalaLayout3 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout3.setGridheight(15);
        koalaLayout3.setGridwidth(15);
        jPanel3.setLayout(koalaLayout3);

        jLabel3.setText("Edad Actual:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Dias en el Programa: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel11.setText("Peso Actual (gr)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        jPanel3.add(jLabel11, gridBagConstraints);

        jLabel12.setText("Estatura Actual (cm)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        jPanel3.add(jLabel12, gridBagConstraints);

        jLabel13.setText("Per. Cefálico Actual (cm)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 6;
        jPanel3.add(jLabel13, gridBagConstraints);

        jLabel14.setText("Raciones Asignadas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        jPanel3.add(jLabel14, gridBagConstraints);

        jtfEdadActual.setEditable(false);
        jtfEdadActual.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        jPanel3.add(jtfEdadActual, gridBagConstraints);

        jtfRacionesAsignadas.setEditable(false);
        jtfRacionesAsignadas.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        jPanel3.add(jtfRacionesAsignadas, gridBagConstraints);

        jtfDiasPrograma.setEditable(false);
        jtfDiasPrograma.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        jPanel3.add(jtfDiasPrograma, gridBagConstraints);

        jtfPesoActual.setEditable(false);
        jtfPesoActual.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        jPanel3.add(jtfPesoActual, gridBagConstraints);

        jtfEstaturaActual.setEditable(false);
        jtfEstaturaActual.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        jPanel3.add(jtfEstaturaActual, gridBagConstraints);

        jtfPCefalicoActual.setEditable(false);
        jtfPCefalicoActual.setFont(new java.awt.Font("Tahoma", 1, 11));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        jPanel3.add(jtfPCefalicoActual, gridBagConstraints);

        jlNombre.setFont(new java.awt.Font("Tahoma", 1, 14));
        jlNombre.setForeground(new java.awt.Color(0, 0, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        jPanel3.add(jlNombre, gridBagConstraints);

        jlCarnet.setFont(new java.awt.Font("Tahoma", 1, 14));
        jlCarnet.setForeground(new java.awt.Color(0, 0, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        jPanel3.add(jlCarnet, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel3.add(jLabel15, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel16.setText("Carnet: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel3.add(jLabel16, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 25;
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        net.java.dev.koalalayout.KoalaLayout koalaLayout4 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout4.setGridheight(10);
        koalaLayout4.setGridwidth(10);
        jPanel4.setLayout(koalaLayout4);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 6;
        jPanel4.add(jbCancelar, gridBagConstraints);

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 6;
        jPanel4.add(jbAceptar, gridBagConstraints);

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 6;
        jPanel4.add(jbModificar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 5;
        jPanel1.add(jPanel4, gridBagConstraints);

        jMenu3.setText("Archivo");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Editar");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Ayuda");
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-850)/2, (screenSize.height-488)/2, 850, 488);
    }// </editor-fold>//GEN-END:initComponents

    private void jsPesoNacerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsPesoNacerStateChanged
        // TODO add your handling code here:
        this.pesoNac = Double.parseDouble(jsPesoNacer.getValue().toString());
    }//GEN-LAST:event_jsPesoNacerStateChanged

    private void jsPesoNacerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsPesoNacerFocusLost
        // TODO add your handling code here:
        this.pesoNac = Double.parseDouble(jsPesoNacer.getValue().toString());
    }//GEN-LAST:event_jsPesoNacerFocusLost

    private void jsPesoIncorporarseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsPesoIncorporarseStateChanged
        // TODO add your handling code here:
        this.pesoInc = Double.parseDouble(jsPesoIncorporarse.getValue().toString());
    }//GEN-LAST:event_jsPesoIncorporarseStateChanged

    private void jsPesoIncorporarseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsPesoIncorporarseFocusLost
        // TODO add your handling code here:
        this.pesoInc = Double.parseDouble(jsPesoIncorporarse.getValue().toString());
    }//GEN-LAST:event_jsPesoIncorporarseFocusLost

    private void jsEstaturaNacerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsEstaturaNacerStateChanged
        // TODO add your handling code here:
        this.estNac = Double.parseDouble(jsEstaturaNacer.getValue().toString());

    }//GEN-LAST:event_jsEstaturaNacerStateChanged

    private void jsEstaturaNacerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsEstaturaNacerFocusLost
        // TODO add your handling code here:
        this.estNac = Double.parseDouble(jsEstaturaNacer.getValue().toString());
    }//GEN-LAST:event_jsEstaturaNacerFocusLost

    private void jsEstaturaIncorporarseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsEstaturaIncorporarseStateChanged
        // TODO add your handling code here:
        this.estInc = Double.parseDouble(jsEstaturaIncorporarse.getValue().toString());
    }//GEN-LAST:event_jsEstaturaIncorporarseStateChanged

    private void jsEstaturaIncorporarseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsEstaturaIncorporarseFocusLost
        // TODO add your handling code here:
        this.estInc = Double.parseDouble(jsEstaturaIncorporarse.getValue().toString());
    }//GEN-LAST:event_jsEstaturaIncorporarseFocusLost

    private void jsPerimetroCefalicoNacerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsPerimetroCefalicoNacerStateChanged
        // TODO add your handling code here:
        this.PCefNac = Double.parseDouble(jsPerimetroCefalicoNacer.getValue().toString());
    }//GEN-LAST:event_jsPerimetroCefalicoNacerStateChanged

    private void jsPerimetroCefalicoNacerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsPerimetroCefalicoNacerFocusLost
        // TODO add your handling code here:
        this.PCefNac = Double.parseDouble(jsPerimetroCefalicoNacer.getValue().toString());
    }//GEN-LAST:event_jsPerimetroCefalicoNacerFocusLost

    private void jsPerimetroCefalicoIncorporarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsPerimetroCefalicoIncorporarStateChanged
        // TODO add your handling code here:
        this.pCefInc = Double.parseDouble(jsPerimetroCefalicoIncorporar.getValue().toString());
    }//GEN-LAST:event_jsPerimetroCefalicoIncorporarStateChanged

    private void jsPerimetroCefalicoIncorporarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsPerimetroCefalicoIncorporarFocusLost
        // TODO add your handling code here:
        this.pCefInc = Double.parseDouble(jsPerimetroCefalicoIncorporar.getValue().toString());
    }//GEN-LAST:event_jsPerimetroCefalicoIncorporarFocusLost

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        // TODO add your handling code here:
        if (jsPesoNacer.getValue().equals(0) || jsPesoIncorporarse.getValue().equals(0)
                || jsEstaturaNacer.getValue().equals(0) || jsEstaturaIncorporarse.getValue().equals(0)
                || jsPerimetroCefalicoNacer.getValue().equals(0) || jsPerimetroCefalicoIncorporar.getValue().equals(0)) {
            JOptionPane.showMessageDialog(rootPane, "¡Los datos tienen que ser mayor a cero!");
        } else {
            prop = new PropiedadPaciente(fecha, pesoNac, pesoInc, estNac, estInc, PCefNac, pCefInc);
            op.almacenarPropiedad(prop, jlCarnet.getText());
            jbAceptar.setEnabled(false);

        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jcFechaDateChanged(org.freixas.jcalendar.DateEvent evt) {//GEN-FIRST:event_jcFechaDateChanged
        // TODO add your handling code here:
        fecha = new Date(jcFecha.getDate().getTime());
    }//GEN-LAST:event_jcFechaDateChanged

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        try {
            prop = new PropiedadPaciente(fecha, pesoNac, pesoInc, estNac, estInc, PCefNac, pCefInc);
            op.actualizarPropiedades(jlCarnet.getText(), prop);
            Date fecha = new Date(jcFecha.getDate().getTime());
            jtfDiasPrograma.setText(cal.calcularDias(fecha));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(OtrosDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtrosDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtrosDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtrosDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OtrosDatos().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbModificar;
    private org.freixas.jcalendar.JCalendarCombo jcFecha;
    public static javax.swing.JLabel jlCarnet;
    public static javax.swing.JLabel jlEdadInicio;
    public static javax.swing.JLabel jlNombre;
    private javax.swing.JSpinner jsEstaturaIncorporarse;
    private javax.swing.JSpinner jsEstaturaNacer;
    private javax.swing.JSpinner jsPerimetroCefalicoIncorporar;
    private javax.swing.JSpinner jsPerimetroCefalicoNacer;
    private javax.swing.JSpinner jsPesoIncorporarse;
    private javax.swing.JSpinner jsPesoNacer;
    private javax.swing.JTextField jtfDiasPrograma;
    private javax.swing.JTextField jtfEdadActual;
    public static javax.swing.JTextField jtfEstaturaActual;
    public static javax.swing.JTextField jtfPCefalicoActual;
    public static javax.swing.JTextField jtfPesoActual;
    public static javax.swing.JTextField jtfRacionesAsignadas;
    // End of variables declaration//GEN-END:variables
}