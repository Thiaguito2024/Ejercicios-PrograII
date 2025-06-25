package Model;

import java.time.LocalDate;
import java.util.Objects;


public abstract class Espectaculos {
    
    private String nombre;
    private LocalDate fecha;
    private int duracion;

    public Espectaculos(String nombre, LocalDate fecha, int duracion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Espectaculos e)) {
            return false;
        }
        return nombre.equals(e.getNombre()) && fecha.equals(e.getFecha());
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre, fecha);
    }

    @Override
    public String toString() {
        return "Espectaculo{" + "nombre=" + nombre + ", fecha=" + fecha + ", duracion=" + duracion + '}';
    }
}
