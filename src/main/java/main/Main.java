package main;

import javax.swing.WindowConstants;

// @author armando
public class Main {

    public static void main(String[] args) {
        ViewLogin viewLogin = new ViewLogin();
        viewLogin.setResizable(false);
        viewLogin.setLocationRelativeTo(null);
        viewLogin.setTitle("Iniciar sesion");
        viewLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        viewLogin.setVisible(true);

    }
}
