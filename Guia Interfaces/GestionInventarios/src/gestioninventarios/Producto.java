package gestioninventarios;

public class Producto implements ItemInventario {
    
    @Override
    public void agregarStock() {
        System.out.println("Se ha agregado stock al producto.");
    }

    @Override
    public void quitarStock() {
        System.out.println("Se ha quitado stock del producto.");
    }
}
