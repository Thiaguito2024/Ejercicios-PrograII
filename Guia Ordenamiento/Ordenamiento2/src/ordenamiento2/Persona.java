package ordenamiento2;

public class Persona implements Comparable<Persona> {
    
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }    

    @Override
    public int compareTo(Persona p) {
        return Integer.compare(dni, p.getDni());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}