package almacenamientoparte3.lambdas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Almacen<Producto> almacen = new Almacen<>();

        almacen.agregar(new Producto(1, "Samsung", Tipoproducto.ELECTRONICO, 120000));
        almacen.agregar(new Producto(2, "Coca Cola", Tipoproducto.COMESTIBLE, 800));
        almacen.agregar(new Producto(3, "Mr. Musculo", Tipoproducto.LIMPIEZA, 1500));
        almacen.agregar(new Producto(4, "Sony", Tipoproducto.ELECTRONICO, 95000));
        
        // PUNTO 1
        System.out.println("-------------- PUNTO 1 ---------------------");
        List<Producto> electronicos = almacen.filtrar(p -> p.getTipo() == Tipoproducto.ELECTRONICO);
        System.out.println("LISTA PRODUCTOS ELECTRONICIOS: "); 
        mostrarLista(electronicos);
        
        List<Producto> economicos = almacen.filtrar(p -> p.getPrecio() < 2000);
        System.out.println("LISTA PRODUCTOS ECONOMICOS: ");
        mostrarLista(economicos);
        // PUNTO 2 
        System.out.println("-------------- PUNTO 2 ---------------------");
        almacen.paraCadaElemento(p -> {
            if (p.getPrecio() < 50000) {
                System.out.println(p);
            }});
        
        // PUNTO 3
        System.out.println("-------------- PUNTO 3 ---------------------");
        List<String> marcas = almacen.transformar(p -> p.getMarca());
        mostrarLista(marcas);
        
    }
    
    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
            System.out.println(o); 
        } 
    } 
}    