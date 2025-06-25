package genericos2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(List.of(3,2,3,2,4,45));
        
        System.out.println(lista);
        
        agregarElementos(lista, 32);
        
        System.out.println(lista);
    }

    public static <T> void agregarElementos(List<T> lista, T elemento) {
        lista.add(elemento);
    }
    
}