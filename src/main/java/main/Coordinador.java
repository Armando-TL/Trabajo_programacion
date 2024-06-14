package main;
// Armando

import jakarta.persistence.Entity;

@Entity
public class Coordinador extends Usuario {

    private String programa;

    public Coordinador() {
    }

    public Coordinador(String programa, String nombre, String apellido, String dni, String password, String email) {
        super(nombre, apellido, dni, password, email);
        this.programa = programa;
    }

    

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "programa=" + programa + '}';
    }

}
