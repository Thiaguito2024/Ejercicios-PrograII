package sistema.de.reservas;

public class Vuelo implements Reservable{
    
    @Override
    public void reservar(){
        System.out.println("Vuelo reservado con exito");
    }
    
    @Override
    public void cancelarReserva(){
        System.out.println("Vuelo cancelado con exito");
    }
}
