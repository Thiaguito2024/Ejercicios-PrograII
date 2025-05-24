package empleados;

public class Desarrollador extends Empleado{
    
    private String lenguaje;
    
    public Desarrollador(String lenguaje, String nombre, int salario) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }
    
}
