package contarelementos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(3,2,4,2,3,9));

        System.out.println("Cant de numeros en la lista: " + contarElementos(numeros));
    }
    
    public static int contarElementos(List<?> lista) {
        return lista.size();
    }
}