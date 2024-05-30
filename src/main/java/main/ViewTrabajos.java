package main;

public class ViewTrabajos extends javax.swing.JFrame {
    Usuario usuario;
    public ViewTrabajos() {
        initComponents();
        usuario = new Usuario();
        usuario.cargarBox(ComboBoxTipoTrabajo);
        
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
        setMinimumSize(new java.awt.Dimension(1100, 660));
        setPreferredSize(new java.awt.Dimension(1100, 660));
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

        jLabel3.setText("Descripción del problema");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txtProblematica.setColumns(20);
        txtProblematica.setRows(5);
        jScrollPane2.setViewportView(txtProblematica);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 314, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 265, -1));

        ComboBoxTipoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxTipoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 265, -1));

        jLabel4.setText("Objetivo general:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        txtObjetivogeneral.setColumns(20);
        txtObjetivogeneral.setRows(5);
        jScrollPane3.setViewportView(txtObjetivogeneral);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 314, 100));

        jLabel5.setText("Justificación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        txtObjetivoGeneral.setColumns(20);
        txtObjetivoGeneral.setRows(5);
        jScrollPane4.setViewportView(txtObjetivoGeneral);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 310, -1));

        jLabel6.setText("Objetivos Especificos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        txtObjetivoEspecificos.setColumns(20);
        txtObjetivoEspecificos.setRows(5);
        jScrollPane6.setViewportView(txtObjetivoEspecificos);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 310, 100));

        btnCrear.setText("Guardar");
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 110, -1));

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, 120, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 110, -1));

        jLabel7.setText("CC Estudiante 1:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 246, -1));

        jLabel8.setText("CC Estudiante 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 246, -1));

        btnAdjuntar.setText("Adjuntar archivo");
        btnAdjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdjuntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jLabel9.setText("Nombre de la empresa:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel10.setText("Director de la empresa:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel11.setText("Telefono:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel12.setText("Correo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 60, -1));

        jLabel13.setText("Delegado de la empresa:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));
        getContentPane().add(jtxtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 30));
        getContentPane().add(jtxtDirectorEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 250, 30));
        getContentPane().add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 270, 30));
        getContentPane().add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 250, 30));
        getContentPane().add(jtxtDelegadoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 270, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarActionPerformed
      
    }//GEN-LAST:event_btnAdjuntarActionPerformed

    private void ComboBoxTipoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTipoTrabajoActionPerformed


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
