package javaland;

import java.io.Serializable;

public class Mago implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int nivelDeMagia;

    public Mago(String nombre, int nivelDeMagia) {
        this.nombre = nombre;
        this.nivelDeMagia = nivelDeMagia;
    }

    @Override
    public String toString() {
        return "Mago{" + "nombre=" + nombre + ", nivelDeMagia=" + nivelDeMagia + '}';
    }
    
        
    
}