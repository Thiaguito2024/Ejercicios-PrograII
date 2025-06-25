package genericos3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList(List.of(3,2,4,5,6,7,8));  
        imprimirLista(numeros);
        
    }

    public static<T> void imprimirLista(List<T> lista){
        for(T n : lista) {
            System.out.println(n);
        }
    }
}
