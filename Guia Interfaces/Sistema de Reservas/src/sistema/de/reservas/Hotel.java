package sistema.de.reservas;

public class Hotel implements Reservable{
    
    @Override
    public void reservar(){
        System.out.println("Reserva en hotel guardada con exito");
    }
    
    @Override
    public void cancelarReserva(){
        System.out.println("Reserva en hotel cancelada con exito");
    }
}
