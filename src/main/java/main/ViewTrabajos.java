package main;

public class ViewTrabajos extends javax.swing.JFrame {

    public ViewTrabajos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProblematica = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        ComboBoxTipoTrabajo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObjetivogeneral = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObjetivoGeneral = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtObjetivoEspecificos = new javax.swing.JTextArea();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnAdjuntar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtxtNombreEmpresa = new javax.swing.JTextField();
        jtxtDirectorEmpresa = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtCorreo = new javax.swing.JTextField();
        jtxtDelegadoEmpresa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 645));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 1000, 132));

        jLabel1.setText("Titulo: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 166, -1, -1));

        jLabel2.setText("Tipo de trabajo de grado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 232, -1, -1));

        jLabel3.setText("Descripción del problema");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        txtProblematica.setColumns(20);
        txtProblematica.setRows(5);
        jScrollPane2.setViewportView(txtProblematica);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 314, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 196, 265, -1));

        ComboBoxTipoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxTipoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 262, 265, -1));

        jLabel4.setText("Objetivo general:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        txtObjetivogeneral.setColumns(20);
        txtObjetivogeneral.setRows(5);
        jScrollPane3.setViewportView(txtObjetivogeneral);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 314, 100));

        jLabel5.setText("Justificación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        txtObjetivoGeneral.setColumns(20);
        txtObjetivoGeneral.setRows(5);
        jScrollPane4.setViewportView(txtObjetivoGeneral);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 310, -1));

        jLabel6.setText("Objetivos Especificos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, -1, -1));

        txtObjetivoEspecificos.setColumns(20);
        txtObjetivoEspecificos.setRows(5);
        jScrollPane6.setViewportView(txtObjetivoEspecificos);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, 310, 100));

        btnCrear.setText("Guardar");
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 800, 88, -1));

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 800, -1, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 800, 88, -1));

        jLabel7.setText("CC Estudiante 1:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 246, -1));

        jLabel8.setText("CC Estudiante 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 246, -1));

        btnAdjuntar.setText("Adjuntar archivo");
        getContentPane().add(btnAdjuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, -1, -1));

        jLabel9.setText("Nombre de la empresa:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel10.setText("Director de la empresa:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        jLabel11.setText("Telefono:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel12.setText("Correo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jLabel13.setText("Delegado de la empresa:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jtxtNombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 30));

        jtxtDirectorEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDirectorEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtDirectorEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 300, 30));

        jtxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 270, 30));
        getContentPane().add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 300, 30));
        getContentPane().add(jtxtDelegadoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 270, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTipoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoTrabajoActionPerformed


    }//GEN-LAST:event_ComboBoxTipoTrabajoActionPerformed

    private void jtxtNombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreEmpresaActionPerformed
        
    }//GEN-LAST:event_jtxtNombreEmpresaActionPerformed

    private void jtxtDirectorEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDirectorEmpresaActionPerformed
        
    }//GEN-LAST:event_jtxtDirectorEmpresaActionPerformed

    private void jtxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTelefonoActionPerformed
        
    }//GEN-LAST:event_jtxtTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTipoTrabajo;
    private javax.swing.JButton btnAdjuntar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jtxtNombreEmpresa;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JTextArea txtObjetivoEspecificos;
    private javax.swing.JTextArea txtObjetivoGeneral;
    private javax.swing.JTextArea txtObjetivogeneral;
    private javax.swing.JTextArea txtProblematica;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
