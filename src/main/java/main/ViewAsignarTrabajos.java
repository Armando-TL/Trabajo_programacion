package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewAsignarTrabajos extends javax.swing.JFrame {

    Usuario usuario;

    public ViewAsignarTrabajos() {
        initComponents();
        usuario = new Usuario();
        usuario.cargarBoxDocentes(comboBoxDocentes);
        MostrarTabla(Tabla);
        JcomboEstado.addItem("Aprobado");
        JcomboEstado.addItem("Rechazado");

    }

    private Connection openConexion() {
        return Conexion.getInstaciaConexion().getConexion();

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
        txtProblematica = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObjetivoespecifico = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtJustificacion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEstudiante1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEstudiante2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtEstudiante3 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtObjetivogeneral = new javax.swing.JTextArea();
        comboBoxDocentes = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIdtrabajo = new javax.swing.JTextField();
        txtTitulo1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JcomboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 756, 90));

        jLabel1.setText("Titulo: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, -1, -1));

        jLabel2.setText("Tipo de trabajo de grado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 203, -1, -1));

        jLabel3.setText("Descripción del problema");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 263, -1, -1));

        txtProblematica.setColumns(20);
        txtProblematica.setRows(5);
        jScrollPane2.setViewportView(txtProblematica);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 287, 314, -1));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 165, 265, -1));

        jLabel4.setText("Objetivo general:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 404, -1, -1));

        txtObjetivoespecifico.setColumns(20);
        txtObjetivoespecifico.setRows(5);
        jScrollPane3.setViewportView(txtObjetivoespecifico);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 448, 314, 100));

        jLabel5.setText("Justificación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 263, -1, -1));

        txtJustificacion.setColumns(20);
        txtJustificacion.setRows(5);
        jScrollPane4.setViewportView(txtJustificacion);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 287, 310, -1));

        jLabel6.setText("Objetivos Especificos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 401, -1, -1));

        btnCrear.setText("Guardar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 631, 110, -1));

        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 631, 110, -1));

        jLabel7.setText("CC Estudiante 1:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 95, -1, -1));
        getContentPane().add(txtEstudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 119, 246, -1));

        jLabel8.setText("CC Estudiante 2:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 149, -1, -1));
        getContentPane().add(txtEstudiante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 173, 246, -1));

        jLabel10.setText("CC Estudiante 3:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 203, -1, -1));
        getContentPane().add(TxtEstudiante3, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 227, 246, -1));

        txtObjetivogeneral.setColumns(20);
        txtObjetivogeneral.setRows(5);
        jScrollPane5.setViewportView(txtObjetivogeneral);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 432, 314, 100));

        getContentPane().add(comboBoxDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 566, 181, -1));

        jLabel14.setText("Asignar docente:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 569, -1, -1));

        jLabel15.setText("Id trabajo grado");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 557, -1, -1));

        txtIdtrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdtrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdtrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 554, 155, -1));
        getContentPane().add(txtTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 227, 265, -1));

        jLabel9.setText("Id:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 126, -1, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 123, 75, -1));

        jLabel11.setText("Estado del proyecto:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 593, -1, -1));

        JcomboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(JcomboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 590, 126, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtIdtrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdtrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdtrabajoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Usuario myUsuario = new Usuario();
        try {
            String selectedItem = (String) comboBoxDocentes.getSelectedItem();

            String[] parts = selectedItem.split(":");
            String idDocente = parts[0];

            String sql = """ 
                     UPDATE trabajo_de_grado SET docenteDirector = ?, aprobado = ? WHERE id = ?;""";
            //actualice la consulta
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, idDocente); // Pasar el ID del docente
            ps.setInt(2, getEstado()); // ps.setString(2, (String) JcomboEstado.getSelectedItem());
            ps.setString(3, JcomboEstado.getActionCommand()); // VERIFIQUE EL ID
            ps.executeUpdate();
            MostrarTabla(Tabla);
            JOptionPane.showMessageDialog(null, "Trabajo asignado con exito");
            
           
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        } finally {
            Conexion.getInstaciaConexion().cerrarBase();
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private int getEstado(){
        if (JcomboEstado.getSelectedItem().equals("Aprobado")) {
            return 1;
        }else /*if (JcomboEstado.getSelectedItem().equals("Rechazado"))*/ {
         return 0;
        }
    }
    
    
    
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        int selectedRow = Tabla.getSelectedRow();

        // Verificar si se ha seleccionado alguna fila
        if (selectedRow != -1) {
            // Obtener los datos de la fila seleccionada
            String id = Tabla.getValueAt(selectedRow, 0).toString();
            String titulo = Tabla.getValueAt(selectedRow, 1).toString();
            String estudiante1 = Tabla.getValueAt(selectedRow, 2).toString();
            String estudiante2 = Tabla.getValueAt(selectedRow, 3).toString();
            String estudiante3 = Tabla.getValueAt(selectedRow, 4).toString();
            String estado = Tabla.getValueAt(selectedRow, 5).toString();
            String docenteDirector = Tabla.getValueAt(selectedRow, 6).toString();
            String problema = Tabla.getValueAt(selectedRow, 7).toString();
            String justificacion = Tabla.getValueAt(selectedRow, 8).toString();
            String objetivosGeneral = Tabla.getValueAt(selectedRow, 9).toString();
            String objetivoEspecifico = Tabla.getValueAt(selectedRow, 10).toString();
            String idTrabajo = Tabla.getValueAt(selectedRow, 11).toString();

            // Mostrar los datos en las cajas de texto
            txtId.setText(id);
            txtTitulo.setText(titulo);
            txtEstudiante1.setText(estudiante1);
            txtEstudiante2.setText(estudiante2);
            TxtEstudiante3.setText(estudiante3);
            txtProblematica.setText(problema);
            txtJustificacion.setText(justificacion);
            txtObjetivogeneral.setText(objetivosGeneral);
            txtObjetivoespecifico.setText(objetivoEspecifico);
            txtIdtrabajo.setText(idTrabajo);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para consultar");
    }//GEN-LAST:event_btnconsultarActionPerformed
    }


    private void JcomboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcomboEstadoActionPerformed
        String estadoSeleccionado = (String) JcomboEstado.getSelectedItem();

        switch (estadoSeleccionado) {
            case "Aprobado":

                System.out.println("Se seleccionó 'Aprobado'");
                break;
            case "Rechazado":

                System.out.println("Se seleccionó 'Rechazado'");
                break;
            default:

                System.out.println("Opción no reconocida");
                break;
        }
        
        JOptionPane.showMessageDialog(null, getEstado());
    }//GEN-LAST:event_JcomboEstadoActionPerformed

    public void MostrarTabla(JTable jTable1) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        modelo.addColumn("ID");
        modelo.addColumn("TITULO");
        modelo.addColumn("ID ESTUDIANTE 1");
        modelo.addColumn("ID Estudiante 2");
        modelo.addColumn("ID Estudiante 3");
        modelo.addColumn(" ESTADO");
        modelo.addColumn("DOCENTE DIRECTOR");
        modelo.addColumn("PROBLEMA");
        modelo.addColumn("JUSTIFICACION");
        modelo.addColumn("OBJETIVO GENERAL");
        modelo.addColumn(" OBJETIVOS ESPECIFICOS");
        modelo.addColumn("ID TRABAJO DE GRADO");

        try {
            String sql = "SELECT * FROM desarrollo_tecnologico;";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("id");
                String titulo = rs.getString("titulo");
                String estudiante1 = rs.getString("id_alumnoOne");
                String estudiante2 = rs.getString("id_alumnoTwo");
                String estudiante3 = rs.getString("id_alumnoThree");
                String estado = rs.getString("estado");
                String docenteDirector = rs.getString("docenteDirector");
                String problema = rs.getString("problema");
                String justificacion = rs.getString("justificacion");
                String objetivosGeneral = rs.getString("objetivos_generales");
                String objetivoEspecifico = rs.getString("objetivos_especificos");
                String idTrabajo = rs.getString("id_trabajo_grado");

                modelo.addRow(new Object[]{id, titulo, estudiante1, estudiante2, estudiante3, estado, docenteDirector,
                     problema, justificacion, objetivosGeneral, objetivoEspecifico, idTrabajo});
                jTable1.setModel(modelo);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        } finally {
            Conexion.getInstaciaConexion().cerrarBase();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboEstado;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtEstudiante3;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JComboBox<String> comboBoxDocentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField txtIdtrabajo;
    private javax.swing.JTextArea txtJustificacion;
    private javax.swing.JTextArea txtObjetivoespecifico;
    private javax.swing.JTextArea txtObjetivogeneral;
    private javax.swing.JTextArea txtProblematica;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTitulo1;
    // End of variables declaration//GEN-END:variables
}
