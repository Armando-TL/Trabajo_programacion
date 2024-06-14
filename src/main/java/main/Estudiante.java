package main;
// @author armando

import jakarta.persistence.Entity;

@Entity
public class Estudiante extends Usuario {

    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String carrera, String nombre, String apellido, String dni, String password, String email) {
        super(nombre, apellido, dni, password, email);
        this.carrera = carrera;
    }

    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }

}
