package gestioninventarios;

public class Main {
    public static void main(String[] args) {
        
        ItemInventario producto = new Producto();
        ItemInventario servicio = new Servicio();

        System.out.println("--- Inventario de Producto ---");
        producto.agregarStock();
        producto.quitarStock();

        System.out.println("--- Inventario de Servicio ---");
        servicio.agregarStock();
        servicio.quitarStock();
    }
}

