package ordenamiento6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Estudiante> estudiantes = new ArrayList<>();
        Estudiante e1 = new Estudiante("Ana", 20, 8.5);
        Estudiante e2 = new Estudiante("Bruno", 22, 9.2);
        Estudiante e3 = new Estudiante("Carla", 21, 7.8);
        Estudiante e4 = new Estudiante("Diego", 20, 9.2);
        agregar(estudiantes, e1);
        agregar(estudiantes, e2);
        agregar(estudiantes, e3);
        agregar(estudiantes, e4);
        
        mostrarLista(estudiantes);
        
        System.out.println("Ordenando por nota: ");
        Collections.sort(estudiantes);
        mostrarLista(estudiantes);
        
        System.out.println("Ordenando por edad: ");
        estudiantes.sort(new ComparatorEdadMayorMenor());
        mostrarLista(estudiantes);
        
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
