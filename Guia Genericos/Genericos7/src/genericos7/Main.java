package genericos7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>(List.of("hola", null, "mundo", null, "java"));
        eliminarNulos(palabras);
        System.out.println("Lista después de eliminar nulos: " + palabras);
        
    }
    
    public static<T> void eliminarNulos(List<T> lista){
        lista.removeIf(elemento -> elemento == null);
    }
    
}
