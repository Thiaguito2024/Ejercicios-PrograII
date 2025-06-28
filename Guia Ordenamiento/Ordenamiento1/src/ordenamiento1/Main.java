package ordenamiento1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>(List.of(
            new Producto("Pizza", 1000),
            new Producto("Empanada", 700),
            new Producto("Pancho", 700),
            new Producto("Pizza cebolla", 700),
            new Producto("Pizza morron", 700),
            new Producto("Pizza provolone", 700),
            new Producto("Arveja", 120),
            new Producto("PizzaJamon", 700)
        ));
        mostrarLista(productos);

        Producto p1 = new Producto("Pizza", 1000);
        Producto p2 = new Producto("Empanada", 700);
        System.out.println(p1.compareTo(p2));
        
        System.out.println("\n----------------------------------");
        Collections.sort(productos, new ComparadorPorNombre());
        mostrarLista(productos);
    }
    
    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
        System.out.println(o); 
        } 
        System.out.println("\n-----------------------------");
    }
}