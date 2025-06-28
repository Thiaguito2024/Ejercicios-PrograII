package ordenamiento3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("La ciudad del fuego secreto"));
        libros.add(new Libro("Don Quijote"));
        libros.add(new Libro("El Principito"));
        libros.add(new Libro("Borges, Obras Completas"));
        
        System.out.println("Libros original: \n");
        mostrarLista(libros);
        
        System.out.println("Libros ordenados por order inverso: \n");
        Collections.sort(libros, new ComparadorTituloOrdenInverso());
        mostrarLista(libros);

    }
    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
            System.out.println(o); 
        } 
        System.out.println("\n-----------------------------");
    }
}