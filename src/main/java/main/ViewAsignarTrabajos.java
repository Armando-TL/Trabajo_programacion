package main;

// @author FARADAY
public class ViewAsignarTrabajos extends javax.swing.JFrame {

    public ViewAsignarTrabajos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProblematica = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        ComboBoxTipoTrabajo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObjetivoGeneral = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtJustificacion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtObjetivoEspecificos = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtxtNombreEmpresa1 = new javax.swing.JTextField();
        jtxtDirectorEmpresa = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
        jtxtDelegadoEmpresa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Titulo: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel2.setText("Tipo de trabajo de grado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel3.setText("Descripción del problema");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        txtProblematica.setColumns(20);
        txtProblematica.setRows(5);
        jScrollPane2.setViewportView(txtProblematica);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 314, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 265, -1));

        ComboBoxTipoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxTipoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 265, -1));

        jLabel4.setText("Objetivo general:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 607, -1, -1));

        txtObjetivoGeneral.setColumns(20);
        txtObjetivoGeneral.setRows(5);
        jScrollPane3.setViewportView(txtObjetivoGeneral);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 629, 314, 100));

        jLabel5.setText("Justificación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        txtJustificacion.setColumns(20);
        txtJustificacion.setRows(5);
        jScrollPane4.setViewportView(txtJustificacion);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 310, -1));

        jLabel6.setText("Objetivos Especificos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 607, -1, -1));

        txtObjetivoEspecificos.setColumns(20);
        txtObjetivoEspecificos.setRows(5);
        jScrollPane6.setViewportView(txtObjetivoEspecificos);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 629, 310, 100));

        jLabel7.setText("CC Estudiante 1:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 246, -1));

        jLabel8.setText("CC Estudiante 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 246, -1));

        jLabel9.setText("Nombre de la empresa:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel10.setText("Director de la empresa:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel11.setText("Telefono:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel12.setText("Correo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel13.setText("Delegado de la empresa:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jtxtNombreEmpresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreEmpresa1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtNombreEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 270, 30));

        jtxtDirectorEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDirectorEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtDirectorEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 300, 30));

        jtxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 270, 30));
        getContentPane().add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 300, -1));
        getContentPane().add(jtxtDelegadoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 270, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 882, 95));

        btnCrear.setText("Guardar");
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 826, 88, -1));

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 826, -1, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 826, 88, -1));

        jLabel14.setText("Asignar docente:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 782, -1, -1));

        getContentPane().add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 779, 182, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTipoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoTrabajoActionPerformed

    }//GEN-LAST:event_ComboBoxTipoTrabajoActionPerformed

    private void jtxtNombreEmpresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreEmpresa1ActionPerformed

    }//GEN-LAST:event_jtxtNombreEmpresa1ActionPerformed

    private void jtxtDirectorEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDirectorEmpresaActionPerformed

    }//GEN-LAST:event_jtxtDirectorEmpresaActionPerformed

    private void jtxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelefonoActionPerformed

    }//GEN-LAST:event_jtxtTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTipoTrabajo;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDelegadoEmpresa;
    private javax.swing.JTextField jtxtDirectorEmpresa;
    private javax.swing.JTextField jtxtNombreEmpresa1;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JTextArea txtJustificacion;
    private javax.swing.JTextArea txtObjetivoEspecificos;
    private javax.swing.JTextArea txtObjetivoGeneral;
    private javax.swing.JTextArea txtProblematica;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
