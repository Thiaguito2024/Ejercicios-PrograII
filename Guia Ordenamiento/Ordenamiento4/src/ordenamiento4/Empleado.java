package ordenamiento4;

public class Empleado implements Comparable<Empleado> {
    
    private String nombre;
    private double salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Empleado e) {
        return Double.compare(salario, e.getSalario());
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + '}';
    }
}