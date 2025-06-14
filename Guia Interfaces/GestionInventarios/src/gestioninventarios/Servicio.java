package gestioninventarios;

public class Servicio implements ItemInventario {

    @Override
    public void agregarStock() {
        System.out.println("Se ha agregado disponibilidad al servicio.");
    }

    @Override
    public void quitarStock() {
        System.out.println("Se ha reducido disponibilidad del servicio.");
    }
}
