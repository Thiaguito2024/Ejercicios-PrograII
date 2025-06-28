package ordenamiento6;

public class Estudiante implements Comparable<Estudiante> {
    
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.edad = edad;
        this.nombre = nombre;
        this.notaPromedio = notaPromedio;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public double getNotaPromedio(){
        return notaPromedio;
    }

    @Override
    public int compareTo(Estudiante e) {
        return Double.compare(e.getNotaPromedio(), notaPromedio);
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", edad=" + edad + ", notaPromedio=" + notaPromedio + '}';
    }
}