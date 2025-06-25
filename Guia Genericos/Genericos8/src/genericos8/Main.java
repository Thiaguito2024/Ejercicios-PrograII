package genericos8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList(List.of(3,2,4,5,6,7,8));
        System.out.println(numeros);
        
        reemplazarElemento(numeros, 2, 1);
        System.out.println(numeros);
    }
    
    public static <T> void reemplazarElemento(List<T> lista, T elementoViejo, T elementoNuevo) {
        for(int i = 0; i < lista.size(); i++){
            if (lista.get(i).equals(elementoViejo)) {
                lista.set(i, elementoNuevo);
            }
        }
    }
}
