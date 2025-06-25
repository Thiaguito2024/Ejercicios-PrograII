package Almacenparte1;

public class Main {
    public static void main(String[] args) {
        
        Almacen<Producto> almacen = new Almacen<>();
        
        Producto p1 = new Producto(1, "La Serenísima", Tipoproducto.COMESTIBLE, 950.00);
        Producto p2 = new Producto(2, "Samsung", Tipoproducto.ELECTRONICO, 120000.00);
        Producto p3 = new Producto(3, "Procenex", Tipoproducto.LIMPIEZA, 1800.50);
        Producto p4 = new Producto(4, "Arcor", Tipoproducto.COMESTIBLE, 450.75);
        Producto p5 = new Producto(5, "Philips", Tipoproducto.ELECTRONICO, 85000.00);
        Producto p6 = new Producto(6, "Ala", Tipoproducto.LIMPIEZA, 2200.00);
        
        almacen.agregar(p1);
        almacen.agregar(p2);
        almacen.agregar(p3);
        almacen.agregar(p4);
        almacen.agregar(p5);
        almacen.agregar(p6);
        

    }
}