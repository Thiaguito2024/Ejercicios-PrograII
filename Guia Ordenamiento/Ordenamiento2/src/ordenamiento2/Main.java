package ordenamiento2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Lucas", 25));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Maria", 20));
        personas.add(new Persona("Zoe", 30));
        
        mostrarLista(personas);
        
        System.out.println("Personas ordenadas por nombre: \n");
        personas.sort(new ComparatorPersonaPorNombre());
        mostrarLista(personas);
        
        System.out.println("Personas ordenadas por dni: \n");
        Collections.sort(personas);
        mostrarLista(personas);
        
    }
    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
        System.out.println(o); 
        } 
        System.out.println("\n-----------------------------");
    }
}