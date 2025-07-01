package integradorarchivos;

import config.RutasArchivo;
import java.util.ArrayList;
import java.util.List;
import model.Empleado;
import repository.PersistenciaEmpleados;
import service.GestorEmpleados;

public class Main {
    public static void main(String[] args) {
        
        List<Empleado> empleados = new ArrayList<>();
        List<Empleado> empleados2 = PersistenciaEmpleados.deserializarEmpleados(RutasArchivo.getRutaBinarioString());;
        List<Empleado> empleados3 = new ArrayList<>();
        
        GestorEmpleados.hardCodearEmpleados(empleados);
        GestorEmpleados.mostrarEmpleados(empleados);
        
        System.out.println("----------------------------------------");
        
        PersistenciaEmpleados.serializarEmpleados(empleados, RutasArchivo.getRutaBinarioString());
        GestorEmpleados.mostrarEmpleados(empleados2);
        
        System.out.println("----------------------------------------");

        PersistenciaEmpleados.guardarEmpleadosCSV(empleados2, RutasArchivo.getRutaCSVString());
        
        System.out.println("Punto 3");
        PersistenciaEmpleados.guardarEmpleadosCSV(empleados2, RutasArchivo.getRutaCSVString());
        empleados3 = PersistenciaEmpleados.cargarEmpleadosCSV(RutasArchivo.getRutaCSVString());
        GestorEmpleados.mostrarEmpleados(empleados3);
        
        /*
        List<Empleado> empleadosRecuperadosCSV = PersistenciaEmpleados.cargarEmpleadosCSV(RutasArchivo.getRutaCSVString());
        GestorEmpleados.mostrarEmpleados(empleadosRecuperadosCSV);
        */
    }
    
}