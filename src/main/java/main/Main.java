package main;

import javax.swing.WindowConstants;
import main.controller.UsuarioController;

// @author armando
public class Main {

    public static void main(String[] args) {
        ViewLogin viewLogin = new ViewLogin();
        viewLogin.setResizable(false);
        viewLogin.setLocationRelativeTo(null);
        viewLogin.setTitle("Iniciar sesion");
        viewLogin.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        viewLogin.setVisible(true);
        
       //new UsuarioController().crearUsuario("Andres", "Narvaez", "11111", "andres@gmail.com", "11111" ,"Contaduria", Usuario.TipoUsuario.ESTUDIANTE);
       
    }
}
