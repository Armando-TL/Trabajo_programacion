package main;

// @author armando
import javax.swing.JOptionPane;

public class ViewDocente extends javax.swing.JFrame {

    Docente docente;
    private String tipoTrabajo = "";

    public ViewDocente(int idDocente) {
        initComponents();
        docente = new Docente();
        docente.cargarTabla(Tabla, idDocente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Ltabla = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        LId = new javax.swing.JLabel();
        btnDescargar = new javax.swing.JButton();
        LProblema = new javax.swing.JLabel();
        LObjetivoG = new javax.swing.JLabel();
        LObjetivoEs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProblema = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObjetivoEs = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtObjetivoGeneral = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtJustificacion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        btnVistaPrevia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(760, 600));
        setPreferredSize(new java.awt.Dimension(730, 595));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setForeground(new java.awt.Color(0, 0, 0));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 730, 110));

        Ltabla.setText("Trabajos Asignados");
        getContentPane().add(Ltabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        txtId.setEditable(false);
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        LId.setText("ID:");
        getContentPane().add(LId, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 160, -1, -1));

        btnDescargar.setBackground(new java.awt.Color(78, 127, 255));
        btnDescargar.setForeground(new java.awt.Color(255, 255, 255));
        btnDescargar.setText("Descargar formato");
        btnDescargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDescargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 140, 30));

        LProblema.setText("Problema: ");
        getContentPane().add(LProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 260, -1, -1));

        LObjetivoG.setText("Objetivo General:");
        getContentPane().add(LObjetivoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        LObjetivoEs.setText("Objetivo Especifico: ");
        getContentPane().add(LObjetivoEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 400, -1, -1));

        jLabel1.setText("Justificacion: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtProblema.setColumns(20);
        txtProblema.setRows(5);
        txtProblema.setName(""); // NOI18N
        jScrollPane2.setViewportView(txtProblema);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 290, -1));

        txtObjetivoEs.setColumns(20);
        txtObjetivoEs.setRows(5);
        txtObjetivoEs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtObjetivoEs.setDoubleBuffered(true);
        jScrollPane4.setViewportView(txtObjetivoEs);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 290, -1));

        txtObjetivoGeneral.setColumns(20);
        txtObjetivoGeneral.setRows(5);
        txtObjetivoGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane5.setViewportView(txtObjetivoGeneral);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 290, -1));

        txtJustificacion.setColumns(20);
        txtJustificacion.setRows(5);
        txtJustificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane6.setViewportView(txtJustificacion);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 290, -1));

        jLabel2.setText("Titulo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 210, -1, -1));

        txtTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, 20));

        btnVistaPrevia.setBackground(new java.awt.Color(78, 127, 255));
        btnVistaPrevia.setForeground(new java.awt.Color(255, 255, 255));
        btnVistaPrevia.setText("Vista previa");
        btnVistaPrevia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnVistaPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaPreviaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        docente.seleccionar(Tabla);
        txtId.setText(docente.id);
        txtTitulo.setText(docente.titulo);
        tipoTrabajo = docente.tipoTrabajo;

    }//GEN-LAST:event_TablaMouseClicked

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        if (id > 0 && !tipoTrabajo.equals("")) {
            new Usuario().descargarPdf(id, tipoTrabajo);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione el ID el trabajo");
        }
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void btnVistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaPreviaActionPerformed
        int id = Integer.parseInt(txtId.getText());
        if (id > 0 && !tipoTrabajo.equals("")) {
            docente.vistaPrevia(tipoTrabajo, id);
            txtProblema.setText(docente.problema);
            txtObjetivoGeneral.setText(docente.objetivoGe);
            txtObjetivoEs.setText(docente.objetivoEs);
            txtJustificacion.setText(docente.justificacion);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione el ID del trabajo");
        }
    }//GEN-LAST:event_btnVistaPreviaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LId;
    private javax.swing.JLabel LObjetivoEs;
    private javax.swing.JLabel LObjetivoG;
    private javax.swing.JLabel LProblema;
    private javax.swing.JLabel Ltabla;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton btnVistaPrevia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtJustificacion;
    private javax.swing.JTextArea txtObjetivoEs;
    private javax.swing.JTextArea txtObjetivoGeneral;
    private javax.swing.JTextArea txtProblema;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
