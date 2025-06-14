package sistemadegestiondehotel;

public class Recepcionista extends Persona{
    
    private String legajo;

    public Recepcionista(String legajo, String nombre, String dni) {
        super(nombre, dni);
        this.legajo = legajo;
    }
    public String getLegajo() {
        return legajo;
    }
    public void confirmarReserva(Reserva reserva, Hotel hotel){
        if (!reserva.isConfirmada()){
            reserva.confirmar();
            hotel.agregarReserva(reserva);
            reserva.getCliente().notificar("Tu reserva de la habitacion " + reserva.getHabitacion().getNumero() + " fue confirmada por " + this.nombre);
        }
    }
    public void notificar(String notificacion){
        super.agregarNotificacion(notificacion);
    }
}
