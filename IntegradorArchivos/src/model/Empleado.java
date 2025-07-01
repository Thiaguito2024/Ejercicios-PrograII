package model; 

import java.io.Serializable;
import model.Persona;

public class Empleado extends Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private double sueldo;
    private Sector sector;

    public Empleado(int dni, String nombre, double sueldo, Sector sector) {
        super(dni, nombre);
        this.sueldo = sueldo;
        this.sector = sector;
    }

    public static String toCSVHeader(){
        return "dni,nombre,sueldo,sector";
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" + "dni=" + getDni() + ", nombre=" + getNombre() + "sueldo=" + sueldo + ", sector=" + sector + '}';
    }
    
    @Override
    public String toCSV(){
        return super.toCSV() + "," + sueldo + "," + sector;
    }
    
    public static Empleado fromCSV(String EmpleadoCSV){
        Empleado nuevoEmpleado = null;
        
        if(EmpleadoCSV.endsWith("\n")){
            EmpleadoCSV = EmpleadoCSV.substring(0, EmpleadoCSV.length() -1);
        }
        
        String[] values = EmpleadoCSV.split(",");
        if(values.length == 4) {
            int dni = Integer.parseInt(values[0]);
            String nombre = values[1];
            double sueldo = Double.parseDouble(values[2]);
            Sector sector = Sector.valueOf(values[3]);
            nuevoEmpleado = new Empleado(dni, nombre, sueldo, sector);
        }
        return nuevoEmpleado;
    }
}