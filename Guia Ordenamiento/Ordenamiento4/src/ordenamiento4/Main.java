package ordenamiento4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Empleado> empleados = new ArrayList<>();
        Empleado e1 = new Empleado("Thiago", 800);
        Empleado e2 = new Empleado("Jano", 750);
        Empleado e3 = new Empleado("Lucas", 5000);
        Empleado e4 = new Empleado("Luis", 450);
        agregar(empleados, e1);
        agregar(empleados, e2);
        agregar(empleados, e3);
        agregar(empleados, e4);
        
        System.out.println("Antes de ordenamiento: ");
        mostrarLista(empleados);
        
        System.out.println("Ordenando por salario de menor a mayor: ");
        Collections.sort(empleados);
        mostrarLista(empleados);
        
        System.out.println("Ordenando por nombre: ");
        empleados.sort(new ComparadorPorNombre());
        mostrarLista(empleados);
        
    }
    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
            System.out.println(o); 
        } 
        System.out.println("\n-----------------------------");
    }    
    
    public static <T> void agregar(List<T> lista, T elemento){
        lista.add(elemento);
    }
    
}
