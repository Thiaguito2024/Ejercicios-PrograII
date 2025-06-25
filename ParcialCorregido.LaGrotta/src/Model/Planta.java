package Model;

import java.util.Objects;

public class Planta {
    
    private String nombre;
    private String ubicacion;
    private String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getClima() {
        return clima;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Planta p)) {
            return false;
        }
        return nombre.equals(p.getNombre()) && ubicacion.equals(p.getUbicacion());
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre, ubicacion);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nUbicacion: " + ubicacion + "\nClima: " + clima;
    }
}
