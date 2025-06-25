package genericos5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList(List.of(3,2,4));  
        List<Integer> numeros2 = new ArrayList(List.of(5,6,7,8));  
        List<Integer> combinadas = combinarListas(numeros, numeros2);
        
        System.out.println(combinadas);

        
    }

    public static<T> List<T> combinarListas(List<T> lista1, List<T> lista2){
        List<T> combinada = new ArrayList<>(lista1);
        combinada.addAll(lista2);
        return combinada;
    }
}
