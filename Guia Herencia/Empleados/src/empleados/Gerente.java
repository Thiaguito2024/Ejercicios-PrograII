package empleados;

public class Gerente extends Empleado{
    
    private int cantEmpleadosSupervisados;
           
    public Gerente(int cantEmpleadosSupervisados, String nombre, int salario){
        super(nombre, salario);
        this.cantEmpleadosSupervisados = cantEmpleadosSupervisados;
    }
            
}

