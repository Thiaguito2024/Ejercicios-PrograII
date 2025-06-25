package ordenamiento;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        
    List<Integer> numeros = new ArrayList(List.of(3,2,6,1,8,9,23,7));
    List<String> nombres = new ArrayList(List.of("thiago", "luis", "ester", "lucas", "alberto"));
    List<Persona> personas = new ArrayList<>(
            List.of(
                new Persona(23456789, "Carlos", 35, 1.78, 'M', Nacionalidad.Uruguaya),
                new Persona(34567890, "Ana", 22, 1.60, 'F', Nacionalidad.Brasilera),
                new Persona(45678901, "Javier", 41, 1.82, 'M', Nacionalidad.Chilena),
                new Persona(56789012, "Martina", 30, 1.70, 'F', Nacionalidad.Argentina),
                new Persona(67890123, "Pedro", 27, 1.75, 'M', Nacionalidad.Uruguaya),
                new Persona(12345678, "Lucia", 28, 1.65, 'F', Nacionalidad.Argentina)
            )  
    );
    
        mostrarLista(personas);
    
        //Collections.sort(personas, new ComparatorPersonaNomrbeAsc()); 
        //Collections.sort(personas, new ComparatorPersonaGeneroAsc()); 
        //Collections.sort(personas, new ComparadorPersonaNacionalidad()); 
        Collections.sort(personas, new ComparatorPersonaGeneroAltura());
        
        /*
        Collections.sort(personas); 
        Collections.sort(personas, Comparator.naturalOrder());
        HACEN EXACTAMENTE LO MISMO
        */
        
        /*
        Collections.sort(personas, Comparator.naturalOrder());
        LO ORDENA DECRECIENTEMENTE
        */
        
        //personas.sort(null); // Este metodo lo tienen las listas, y ordena naturalmente
        mostrarLista(personas);
        
    }  
    
    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
        System.out.println(o); 
        } 
        System.out.println("\n-----------------------------");
    }
    
}