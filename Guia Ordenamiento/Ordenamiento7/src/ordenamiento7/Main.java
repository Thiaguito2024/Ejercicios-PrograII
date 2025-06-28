package ordenamiento7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Juego> juegos = new ArrayList<>();
        Juego j1 = new Juego("Zelda: Breath of the Wild", 180, "Aventura");
        Juego j2 = new Juego("God of War", 200, "Accion") ;
        Juego j3 = new Juego("Minecraft", 100, "Creativo");
        Juego j4 = new Juego("FIFA 23", 90, "Deportes");
        Juego j5 = new Juego("Hollow Knight", 150, "Plataformas");
        agregar(juegos, j1);
        agregar(juegos, j2);
        agregar(juegos, j3);
        agregar(juegos, j4);
        agregar(juegos, j5);
        mostrarLista(juegos);
        
        System.out.println("Ordenando por duracion de menor a mayor: ");
        Collections.sort(juegos);
        mostrarLista(juegos);
        
        System.out.println("Ordenando por genero alfabeticamente: ");
        juegos.sort(new ComparatorJuegoAlfabeticamente());
        mostrarLista(juegos);
        
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
