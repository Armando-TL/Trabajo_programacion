package main;

import javax.swing.JOptionPane;

public class ViewAsignarTrabajos extends javax.swing.JFrame {

    Usuario usuario;
    Coordinador coordinador;
    

    public ViewAsignarTrabajos() {
        initComponents();
        usuario = new Usuario();
        coordinador = new Coordinador();
        usuario.cargarBoxDocentes(comboBoxDocentes);
        coordinador.mostrarTabla(Tabla);
        comboEstado.addItem("Aprobado");
        comboEstado.addItem("Rechazado");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProblema = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObjetivoEs = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtJustificacion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEstudiante1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEstudiante2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtEstudiante3 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtObjetivoGe = new javax.swing.JTextArea();
        comboBoxDocentes = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtTipoTrabajo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 860, 90));

        jLabel1.setText("Titulo: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel2.setText("Tipo de trabajo de grado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel3.setText("Descripción del problema:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtProblema.setColumns(20);
        txtProblema.setRows(5);
        jScrollPane2.setViewportView(txtProblema);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 314, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 265, -1));

        jLabel4.setText("Objetivo general:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        txtObjetivoEs.setColumns(20);
        txtObjetivoEs.setRows(5);
        jScrollPane3.setViewportView(txtObjetivoEs);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 314, 100));

        jLabel5.setText("Justificación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        txtJustificacion.setColumns(20);
        txtJustificacion.setRows(5);
        jScrollPane4.setViewportView(txtJustificacion);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 310, -1));

        jLabel6.setText("Objetivos Especificos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 110, -1));

        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 110, -1));

        jLabel7.setText("CC Estudiante 1:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));
        getContentPane().add(txtEstudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 246, -1));

        jLabel8.setText("CC Estudiante 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));
        getContentPane().add(txtEstudiante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 246, -1));

        jLabel10.setText("CC Estudiante 3:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));
        getContentPane().add(TxtEstudiante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 246, -1));

        txtObjetivoGe.setColumns(20);
        txtObjetivoGe.setRows(5);
        jScrollPane5.setViewportView(txtObjetivoGe);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 314, 100));

        getContentPane().add(comboBoxDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 170, 25));

        jLabel14.setText("Asignar docente:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, 20));

        txtTipoTrabajo.setEditable(false);
        getContentPane().add(txtTipoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 265, -1));

        jLabel9.setText("Id:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtId.setEditable(false);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 75, -1));

        jLabel11.setText("Estado del proyecto:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));

        getContentPane().add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 140, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int idTrabajo = Integer.parseInt(txtId.getText());
        String nombreDocente = comboBoxDocentes.getSelectedItem().toString();
        if (idTrabajo > 0 && !nombreDocente.isEmpty()) {
            coordinador.AsignarTrabajo(getEstado(), idTrabajo, nombreDocente);
            coordinador.mostrarTabla(Tabla);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private int getEstado() {
        if (comboEstado.getSelectedItem().equals("Aprobado")) {
            return 1;
        } else /*if (JcomboEstado.getSelectedItem().equals("Rechazado"))*/ {
            return 0;
        }
    }


    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String tipoTrabajo = txtTipoTrabajo.getText();
        if (id > 0 && !tipoTrabajo.equals("")) {
            coordinador.vistaPrevia(tipoTrabajo, id);
            txtProblema.setText(coordinador.problema);
            txtObjetivoGe.setText(coordinador.objetivoGe);
            txtObjetivoEs.setText(coordinador.objetivoEs);
            txtJustificacion.setText(coordinador.justificacion);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione el ID del trabajo");
        }
    }//GEN-LAST:event_btnconsultarActionPerformed


    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        coordinador.seleccionar(Tabla);
        txtId.setText(coordinador.id);
        txtTitulo.setText(coordinador.titulo);
        txtTipoTrabajo.setText(coordinador.tipoTrabajo);
    }//GEN-LAST:event_TablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtEstudiante3;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JComboBox<String> comboBoxDocentes;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtEstudiante1;
    private javax.swing.JTextField txtEstudiante2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtJustificacion;
    private javax.swing.JTextArea txtObjetivoEs;
    private javax.swing.JTextArea txtObjetivoGe;
    private javax.swing.JTextArea txtProblema;
    private javax.swing.JTextField txtTipoTrabajo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
