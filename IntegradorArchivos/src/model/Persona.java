package model;

import java.io.Serializable;

public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private int dni;
    private String nombre; 

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String toCSV(){
        return dni + "," + nombre;
    }
}