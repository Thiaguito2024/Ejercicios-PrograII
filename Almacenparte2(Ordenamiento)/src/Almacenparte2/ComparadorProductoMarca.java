package Almacenparte2;

import java.util.Comparator;

public class ComparadorProductoMarca implements Comparator<Producto> {

    @Override
    public int compare(Producto p1, Producto p2) {
        return p1.getMarca().compareTo(p2.getMarca());
    }
    
}
