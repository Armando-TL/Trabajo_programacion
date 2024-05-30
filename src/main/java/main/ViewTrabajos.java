package main;

import com.mysql.cj.log.NullLogger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ViewTrabajos extends javax.swing.JFrame {

    Usuario usuario;

    public ViewTrabajos() {
        initComponents();
        usuario = new Usuario();
        usuario.cargarBoxTTG(ComboBoxTipoTrabajo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JlDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProblematica = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        ComboBoxTipoTrabajo = new javax.swing.JComboBox<>();
        JlObjetivoGe = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObjetivoGeneral = new javax.swing.JTextArea();
        JlJustificacion = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObjetivoJustificacion = new javax.swing.JTextArea();
        JlObjetivosEs = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtObjetivoEspecificos = new javax.swing.JTextArea();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        JlccEstudiantes = new javax.swing.JLabel();
        txtEstudianteOne = new javax.swing.JTextField();
        txtEstudianteThree = new javax.swing.JTextField();
        btnAdjuntar = new javax.swing.JButton();
        JlNomEmpresa = new javax.swing.JLabel();
        JlDirectorEm = new javax.swing.JLabel();
        JlTelefono = new javax.swing.JLabel();
        jlCorreoEm = new javax.swing.JLabel();
        JlDelegado = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtDirectorEmpresa = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDelegadoEmpresa = new javax.swing.JTextField();
        txtEstudianteTwo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1110, 660));
        setPreferredSize(new java.awt.Dimension(840, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 1060, 90));

        jLabel1.setText("Titulo: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel2.setText("Tipo de trabajo de grado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        JlDescripcion.setText("Descripción del problema");
        getContentPane().add(JlDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txtProblematica.setColumns(20);
        txtProblematica.setRows(5);
        jScrollPane2.setViewportView(txtProblematica);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 314, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 265, 25));

        ComboBoxTipoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxTipoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 265, 25));

        JlObjetivoGe.setText("Objetivo general:");
        getContentPane().add(JlObjetivoGe, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        txtObjetivoGeneral.setColumns(20);
        txtObjetivoGeneral.setRows(5);
        jScrollPane3.setViewportView(txtObjetivoGeneral);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 314, 100));

        JlJustificacion.setText("Justificación:");
        getContentPane().add(JlJustificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        txtObjetivoJustificacion.setColumns(20);
        txtObjetivoJustificacion.setRows(5);
        jScrollPane4.setViewportView(txtObjetivoJustificacion);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 310, -1));

        JlObjetivosEs.setText("Objetivos Especificos:");
        getContentPane().add(JlObjetivosEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));

        txtObjetivoEspecificos.setColumns(20);
        txtObjetivoEspecificos.setRows(5);
        jScrollPane6.setViewportView(txtObjetivoEspecificos);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 290, 230));

        btnCrear.setText("Guardar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 110, -1));

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 120, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 110, -1));

        JlccEstudiantes.setText("CC de Integrantes:");
        getContentPane().add(JlccEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));
        getContentPane().add(txtEstudianteOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 246, 25));
        getContentPane().add(txtEstudianteThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 246, 25));

        btnAdjuntar.setText("Adjuntar archivo");
        btnAdjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdjuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        JlNomEmpresa.setText("Nombre de la empresa:");
        getContentPane().add(JlNomEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        JlDirectorEm.setText("Director de la empresa:");
        getContentPane().add(JlDirectorEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, -1));

        JlTelefono.setText("Telefono:");
        getContentPane().add(JlTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jlCorreoEm.setText("Correo:");
        getContentPane().add(jlCorreoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 60, -1));

        JlDelegado.setText("Delegado de la empresa:");
        getContentPane().add(JlDelegado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        getContentPane().add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 30));
        getContentPane().add(txtDirectorEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 250, 25));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 270, 30));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 250, 25));
        getContentPane().add(txtDelegadoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 270, 30));
        getContentPane().add(txtEstudianteTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 246, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarActionPerformed
        new ProyectoInvestigacion().subirPdf();
    }//GEN-LAST:event_btnAdjuntarActionPerformed

    private void ComboBoxTipoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoTrabajoActionPerformed
        String seleccionado = (String) ComboBoxTipoTrabajo.getSelectedItem();
        if ("Práctica profesional".equals(seleccionado)) {
            txtNombreEmpresa.setVisible(true);
            JlNomEmpresa.setVisible(true);
            txtTelefono.setVisible(true);
            JlTelefono.setVisible(true);
            txtDelegadoEmpresa.setVisible(true);
            JlDelegado.setVisible(true);
            txtDirectorEmpresa.setVisible(true);
            JlDirectorEm.setVisible(true);
            txtCorreo.setVisible(true);
            jlCorreoEm.setVisible(true);
            txtEstudianteThree.setVisible(false);
            txtEstudianteTwo.setVisible(false);

            //cambiar posicion
            getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 310, -1));
            getContentPane().add(JlDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));
            getContentPane().add(JlObjetivoGe, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));
            getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 310, 100));
            getContentPane().add(JlObjetivosEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));
            getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 290, 230));
            getContentPane().add(JlJustificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));
            getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 310, -1));
            //getContentPane().add(txtEstudianteOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 246, 25));
            //getContentPane().add(txtEstudianteThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 246, 25));
            getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 1060, 90));
            setMinimumSize(new java.awt.Dimension(1110, 660));
            setPreferredSize(new java.awt.Dimension(1100, 660));
            getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 110, -1));
            getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 120, -1));
            getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 110, -1));
            getContentPane().add(btnAdjuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        } else {

            txtNombreEmpresa.setVisible(false);
            JlNomEmpresa.setVisible(false);
            txtTelefono.setVisible(false);
            JlTelefono.setVisible(false);
            txtDelegadoEmpresa.setVisible(false);
            JlDelegado.setVisible(false);
            txtDirectorEmpresa.setVisible(false);
            JlDirectorEm.setVisible(false);
            txtCorreo.setVisible(false);
            jlCorreoEm.setVisible(false);
            JlccEstudiantes.setVisible(true);
            txtEstudianteTwo.setVisible(true);
            txtEstudianteThree.setVisible(true);

            //cambiar posicion
            getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 310, 80));
            getContentPane().add(JlDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
            getContentPane().add(JlObjetivoGe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 345, -1, -1));
            getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 365, 310, 80));
            getContentPane().add(JlObjetivosEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));
            getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 310, 80));
            getContentPane().add(JlJustificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 345, -1, -1));
            getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 365, 310, 80));
            getContentPane().add(txtEstudianteThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 246, 25));
            getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 800, 90));
            getContentPane().add(txtEstudianteTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 246, 25));
            //panel
            this.setPreferredSize(new java.awt.Dimension(840, 590));
            this.setMinimumSize(new java.awt.Dimension(840, 590));
            this.setSize(840, 590);
            getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 110, -1));
            getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 120, -1));
            getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 110, -1));
            getContentPane().add(btnAdjuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        }

        // Actualizar el contenedor para reflejar los cambios
        getContentPane().revalidate();
        getContentPane().repaint();
    }//GEN-LAST:event_ComboBoxTipoTrabajoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (ComboBoxTipoTrabajo.getSelectedItem().equals("Desarrollo tecnológico")) {

            String ccIntegranteTwo = txtEstudianteTwo.getText();
            String ccIntegranteThree = txtEstudianteThree.getText();
            String titulo = txtTitulo.getText();
            LocalDate fechaActual = LocalDate.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha_creacion = fechaActual.format(formato);
            String problema = txtProblematica.getText();
            String justificacion = txtObjetivoJustificacion.getText();
            String objetivos_generales = txtObjetivoGeneral.getText();
            String objetivos_especificos = txtObjetivoEspecificos.getText();

            DesarrolloTecnologico desarrolloTecnologico = new DesarrolloTecnologico(ccIntegranteTwo, ccIntegranteThree, titulo, fecha_creacion, problema, justificacion, objetivos_generales, objetivos_especificos);

            desarrolloTecnologico.crear(txtEstudianteOne.getText());
        }
    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTipoTrabajo;
    private javax.swing.JLabel JlDelegado;
    private javax.swing.JLabel JlDescripcion;
    private javax.swing.JLabel JlDirectorEm;
    private javax.swing.JLabel JlJustificacion;
    private javax.swing.JLabel JlNomEmpresa;
    private javax.swing.JLabel JlObjetivoGe;
    private javax.swing.JLabel JlObjetivosEs;
    private javax.swing.JLabel JlTelefono;
    private javax.swing.JLabel JlccEstudiantes;
    private javax.swing.JButton btnAdjuntar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlCorreoEm;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDelegadoEmpresa;
    private javax.swing.JTextField txtDirectorEmpresa;
    private javax.swing.JTextField txtEstudianteOne;
    private javax.swing.JTextField txtEstudianteThree;
    private javax.swing.JTextField txtEstudianteTwo;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextArea txtObjetivoEspecificos;
    private javax.swing.JTextArea txtObjetivoGeneral;
    private javax.swing.JTextArea txtObjetivoJustificacion;
    private javax.swing.JTextArea txtProblematica;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
