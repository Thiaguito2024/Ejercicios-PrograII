package ordenamiento;

public class Persona implements Comparable<Persona>{

    private int dni;
    private String nombre;
    private int edad;
    private double altura;
    private char genero;
    private Nacionalidad nacionalidad;

    public Persona(int dni, String nombre, int edad, double altura, char genero, Nacionalidad nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", genero=" + genero + ", nacionalidad=" + nacionalidad + '}';
    }

    @Override
    public int compareTo(Persona p) {
        return Integer.compare(dni, p.dni);
    }

    public double getAltura() {
        return altura;
    }

    public char getGenero() {
        return genero;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

