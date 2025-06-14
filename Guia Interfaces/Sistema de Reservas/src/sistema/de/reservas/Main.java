package sistema.de.reservas;

public class Main {
    public static void main(String[] args) {
        
        Reservable h = new Hotel();
        Reservable v = new Vuelo();
        
        h.reservar();
        h.cancelarReserva();
        System.out.println("-------------------");
        v.reservar();
        v.cancelarReserva();
    }
}
