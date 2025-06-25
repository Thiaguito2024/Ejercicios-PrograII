package genericos4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> numerosFuente = List.of(1, 2, 3, 4);
        List<Integer> numerosDestino = new ArrayList<>();

        System.out.println(numerosDestino);
        copiarElementos(numerosFuente, numerosDestino);

        System.out.println("Lista de destino despues de copiar elementos: " + numerosDestino);

        List<String> palabrasFuente = List.of("manzana", "naranja", "pera");
        List<String> palabrasDestino = new ArrayList<>();

        System.out.println(palabrasDestino);
        copiarElementos(palabrasFuente, palabrasDestino);
        System.out.println("Lista de destino despues de copiar palabras: " + palabrasDestino);
    }
    
    public static<T> void copiarElementos(List<? extends T> listaOriginal, List<T> listaDestino){
        listaDestino.addAll(listaOriginal);
    } 
}
