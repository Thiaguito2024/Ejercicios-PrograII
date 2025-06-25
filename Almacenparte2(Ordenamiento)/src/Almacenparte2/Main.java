package Almacenparte2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        
        Almacen<Producto> almacen = new Almacen<>();
        
        Comparator<Producto> cmpProductoMarca = (p1, p2) -> p1.getMarca().compareTo(p2.getMarca());
        Comparator<Producto> cmpProductoPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
        Comparator<Producto> cmpProductoTipo = (p1, p2) -> p1.getTipo().compareTo(p2.getTipo());
        Comparator<Producto> cmpProductoMarcaTipo = (p1, p2) -> {
            int cmp = p1.getMarca().compareTo(p2.getMarca());
            if (cmp == 0){
                return  p1.getTipo().name().compareTo(p2.getTipo().name());
            }
            return cmp;
        };
        
        // FALTA AGREGAR PRODUCTOS
        almacen.mostrarContenido();
        almacen.mostrarContenido(cmpProductoMarca);
        almacen.mostrarContenido(cmpProductoPrecio);
        almacen.mostrarContenido(cmpProductoTipo);
        almacen.mostrarContenido(cmpProductoMarcaTipo); 

        

    }
}