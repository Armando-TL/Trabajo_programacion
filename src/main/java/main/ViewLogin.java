package main;

// @author armando
import javax.swing.JOptionPane;
import main.controller.UsuarioController;

public class ViewLogin extends javax.swing.JFrame {

    public ViewLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        JPForm = new javax.swing.JPanel();
        jLsesion = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLDni = new javax.swing.JLabel();
        jLpassword = new javax.swing.JLabel();
        jLrecuperarC = new javax.swing.JLabel();
        btnIniciarS = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPForm.setBackground(new java.awt.Color(255, 255, 255));
        JPForm.setToolTipText("");

        jLsesion.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLsesion.setForeground(new java.awt.Color(0, 0, 0));
        jLsesion.setText("Inciar sesion");

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setAutoscrolls(false);
        txtDni.setBorder(null);

        jLDni.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLDni.setForeground(new java.awt.Color(0, 0, 0));
        jLDni.setText("Dni:");

        jLpassword.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLpassword.setForeground(new java.awt.Color(0, 0, 0));
        jLpassword.setText("Contraseña:");

        jLrecuperarC.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLrecuperarC.setForeground(new java.awt.Color(51, 51, 255));
        jLrecuperarC.setText("Recuperar contraseña");
        jLrecuperarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnIniciarS.setBackground(new java.awt.Color(0, 153, 204));
        btnIniciarS.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        btnIniciarS.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarS.setText("Entrar");
        btnIniciarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSActionPerformed(evt);
            }
        });

        btnRegistrarse.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarse.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setBorder(null);

        javax.swing.GroupLayout JPFormLayout = new javax.swing.GroupLayout(JPForm);
        JPForm.setLayout(JPFormLayout);
        JPFormLayout.setHorizontalGroup(
            JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFormLayout.createSequentialGroup()
                .addGroup(JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLDni))
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLpassword))
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnIniciarS, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLrecuperarC)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarse))
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtPassword))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        JPFormLayout.setVerticalGroup(
            JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPFormLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLsesion)
                .addGap(18, 18, 18)
                .addComponent(jLDni)
                .addGap(22, 22, 22)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLpassword)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnIniciarS)
                .addGap(37, 37, 37)
                .addGroup(JPFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPFormLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLrecuperarC))
                    .addComponent(btnRegistrarse))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed

//        ViewRegistro viewRegistro = new ViewRegistro();
//        viewRegistro.setViewLogin(this);
//        viewRegistro.setLocationRelativeTo(this);
//        viewRegistro.setResizable(false);
//        viewRegistro.setTitle("Registrarse");
//        this.setVisible(false);
//        viewRegistro.setVisible(true);

           

    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIniciarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSActionPerformed
        if (!txtDni.getText().isEmpty() && txtPassword.getPassword().length > 0) {

            String dni = txtDni.getText();
            char[] passwordV = txtPassword.getPassword();
            String password = new String(passwordV);

            UsuarioController usuario = new UsuarioController();
            usuario.setViewLogin(this);
            usuario.iniciarSesion(dni, password);

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_btnIniciarSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPForm;
    private javax.swing.JButton btnIniciarS;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLpassword;
    private javax.swing.JLabel jLrecuperarC;
    private javax.swing.JLabel jLsesion;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtDni;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
