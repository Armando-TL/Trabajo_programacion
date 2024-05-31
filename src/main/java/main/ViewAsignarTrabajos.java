
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
        usuario.cargarBoxDocente(jComboBox1);
        MostarTabla(jTable1);
        
         JcomboEstado.addItem("");
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
        jTable1 = new javax.swing.JTable();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIdtrabajo = new javax.swing.JTextField();
        txtTitulo1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JcomboEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Titulo: ");

        jLabel2.setText("Tipo de trabajo de grado:");

        jLabel3.setText("Descripción del problema");

        txtProblematica.setColumns(20);
        txtProblematica.setRows(5);
        jScrollPane2.setViewportView(txtProblematica);

        jLabel4.setText("Objetivo general:");

        txtObjetivoespecifico.setColumns(20);
        txtObjetivoespecifico.setRows(5);
        jScrollPane3.setViewportView(txtObjetivoespecifico);

        jLabel5.setText("Justificación:");

        txtJustificacion.setColumns(20);
        txtJustificacion.setRows(5);
        jScrollPane4.setViewportView(txtJustificacion);

        jLabel6.setText("Objetivos Especificos:");

        btnCrear.setText("Guardar");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        jLabel7.setText("CC Estudiante 1:");

        jLabel8.setText("CC Estudiante 2:");

        jLabel10.setText("CC Estudiante 3:");

        txtObjetivogeneral.setColumns(20);
        txtObjetivogeneral.setRows(5);
        jScrollPane5.setViewportView(txtObjetivogeneral);

        jLabel14.setText("Asignar docente:");

        jLabel15.setText("Id trabajo grado");

        txtIdtrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdtrabajoActionPerformed(evt);
            }
        });

        jLabel9.setText("Id:");

        jLabel11.setText("Estado del proyecto:");

        JcomboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcomboEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEstudiante3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdtrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JcomboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(479, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstudiante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtEstudiante3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtIdtrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(JcomboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultar)
                    .addComponent(btnCrear))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(420, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(129, 129, 129)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdtrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdtrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdtrabajoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
           Usuario myUsuario = new Usuario();
        try {
            String selectedItem = (String) jComboBox1.getSelectedItem();
       
        String[] parts = selectedItem.split(":");
        String idDocente = parts[0]; 

        String sql = """
                     UPDATE desarrollo_tecnologico d 
                     INNER JOIN trabajo_de_grado t ON d.id_trabajo_grado = t.id
                     SET d.docenteDirector = ?,d.estado = ?
                     WHERE t.id = ?;""";
        PreparedStatement ps = openConexion().prepareStatement(sql);
        ps.setString(1, idDocente); // Pasar el ID del docente
        ps.setString(2, (String) JcomboEstado.getSelectedItem());
        ps.setString(3,JcomboEstado.getActionCommand());
        ps.executeUpdate(); 
            MostarTabla(jTable1);
            JOptionPane.showMessageDialog(null, "Trabajo asignado con exito");
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error"+ e);
        }finally{
            Conexion.getInstaciaConexion().cerrarBase();
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        int selectedRow = jTable1.getSelectedRow();
    
    // Verificar si se ha seleccionado alguna fila
    if (selectedRow != -1) {
        // Obtener los datos de la fila seleccionada
        String id = jTable1.getValueAt(selectedRow, 0).toString();
        String titulo = jTable1.getValueAt(selectedRow, 1).toString();
        String estudiante1 = jTable1.getValueAt(selectedRow, 2).toString();
        String estudiante2 = jTable1.getValueAt(selectedRow, 3).toString();
        String estudiante3 = jTable1.getValueAt(selectedRow, 4).toString();
        String estado = jTable1.getValueAt(selectedRow, 5).toString();
        String docenteDirector = jTable1.getValueAt(selectedRow, 6).toString();
        String problema = jTable1.getValueAt(selectedRow, 7).toString();
        String justificacion = jTable1.getValueAt(selectedRow, 8).toString();
        String objetivosGeneral = jTable1.getValueAt(selectedRow, 9).toString();
        String objetivoEspecifico = jTable1.getValueAt(selectedRow, 10).toString();
        String idTrabajo = jTable1.getValueAt(selectedRow, 11).toString();
        
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
    }//GEN-LAST:event_JcomboEstadoActionPerformed
    
     
    
    
    
    
    
    
    
    public void MostarTabla(JTable jTable1){
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
        modelo.addColumn(" ESTADO" );
        modelo.addColumn("DOCENTE DIRECTOR");
        modelo.addColumn("PROBLEMA");
        modelo.addColumn("JUSTIFICACION");
        modelo.addColumn("OBJETIVO GENERAL");
        modelo.addColumn(" OBJETIVOS ESPECIFICOS" );
        modelo.addColumn("ID TRABAJO DE GRADO");
        
        
   
        
        
        try {
            String sql = "SELECT * FROM desarrollo_tecnologico;";
            PreparedStatement ps =   openConexion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                String id = rs.getString("id");
                String titulo = rs.getString("titulo");
                String estudiante1 = rs.getString("id_alumnoOne");
                String estudiante2 = rs.getString("id_alumnoTwo");
                String estudiante3= rs.getString("id_alumnoThree");
                String estado = rs.getString("estado");
                String docenteDirector = rs.getString("docenteDirector");
                String problema = rs.getString("problema");
                String justificacion= rs.getString("justificacion");
                String objetivosGeneral= rs.getString("objetivos_generales");
                String objetivoEspecifico= rs.getString("objetivos_especificos");
                String idTrabajo= rs.getString("id_trabajo_grado");
                
                

                modelo.addRow(new Object[]{id, titulo,estudiante1,estudiante2,estudiante3,estado,docenteDirector
                ,problema,justificacion,objetivosGeneral,objetivoEspecifico,idTrabajo});
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
    private javax.swing.JTextField TxtEstudiante3;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JTable jTable1;
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
