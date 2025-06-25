package genericos6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList(List.of(3,2,4,5,6,7,8));
        
        System.out.println(buscarElemento(numeros, 9));
    }
    
    public static<T> boolean buscarElemento(List<T> lista, T elemento) {
        return lista.contains(elemento);
    }
}
