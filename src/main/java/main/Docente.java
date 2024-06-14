package main;
// @author armando

import jakarta.persistence.Entity;

@Entity
public class Docente extends Usuario {

    private String Faculta;

    public Docente() {
    }

    public Docente(String Faculta, String nombre, String apellido, String dni, String password, String email) {
        super(nombre, apellido, dni, password, email);
        this.Faculta = Faculta;
    }

    
    
    
    
    public String getFaculta() {
        return Faculta;
    }

    public void setFaculta(String Faculta) {
        this.Faculta = Faculta;
    }

    @Override
    public String toString() {
        return "Docente{" + "Faculta=" + Faculta + '}';
    }
    
    
}
