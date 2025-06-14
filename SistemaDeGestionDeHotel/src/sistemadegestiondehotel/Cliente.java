package sistemadegestiondehotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Persona {
    
    private String mail;
    private ArrayList<Reserva> reservas;

    public Cliente(String mail, String nombre, String dni) {
        super(nombre, dni);
        this.mail = mail;
        reservas = new ArrayList<>();
    }

    public String getMail() {
        return mail;
    }
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void realizarReserva(Hotel hotel, Habitacion habitacion, LocalDate inicio, LocalDate fin){
        ArrayList<Habitacion> habitacionesDisp = hotel.buscarHabitacionesDisponibles(inicio, fin, habitacion.getTipo());
        if (!habitacionesDisp.isEmpty()){
            Reserva reserva = new Reserva(this,habitacion,inicio,fin);
            reservas.add(reserva);
        for (Recepcionista rec : hotel.getRecepcionistas()){
            rec.notificar("Cliente " + this.nombre + " registró una reserva en la habitacion " + habitacion.getNumero() + " para el dia " + inicio + " hasta el " + fin);
        }
        }
        else {
            System.out.println("Habitacion sin disponibilidad");
        }
    }

    public void notificar(String notificacion){
        super.agregarNotificacion(notificacion);
    }
    
    
}
