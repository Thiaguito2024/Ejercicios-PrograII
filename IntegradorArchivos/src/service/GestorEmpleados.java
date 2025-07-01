package service;

import java.util.List;
import model.Empleado;
import model.Sector;

public interface GestorEmpleados {
    
    static void hardCodearEmpleados(List<? super Empleado> lista){
        lista.add(new Empleado(1234, "juan", 1500, Sector.VENTAS));
        lista.add(new Empleado(4567, "rob", 2000, Sector.RRHH));
        lista.add(new Empleado(8785, "thiago", 3988, Sector.VENTAS));
        lista.add(new Empleado(6543, "ignacio", 4566, Sector.CONTABLE));
        lista.add(new Empleado(8764, "martin", 1234, Sector.SISTEMAS));
        lista.add(new Empleado(2367, "pepe", 2345, Sector.RRHH));
        lista.add(new Empleado(2313, "alberto", 3534, Sector.RRHH));
        lista.add(new Empleado(9876, "lucas", 6787, Sector.SISTEMAS));
    }
    
    static void mostrarEmpleados(List<? extends Empleado> lista){
        System.out.println("Lista Empleados: ");
        lista.forEach(System.out::println);
    }
    
}
