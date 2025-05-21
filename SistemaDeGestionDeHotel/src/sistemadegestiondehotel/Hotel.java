package sistemadegestiondehotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    
    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Recepcionista> recepcionistas;
    private ArrayList<Reserva> reservas;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.recepcionistas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public Hotel(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    public ArrayList<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    public void agregarHabitacion(Habitacion habitacion){
        habitaciones.add(habitacion);
    }
    public void agregarRecepcionista(Recepcionista recepcionista){
        recepcionistas.add(recepcionista);
    }
    public void agregarReserva(Reserva reserva){
        if (reserva.isConfirmada()){ 
        reservas.add(reserva);}
    }
    
 public ArrayList<Habitacion> buscarHabitacionesDisponibles(LocalDate inicio , LocalDate fin ,TipoHabitacion tipo){
    ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
    for (Habitacion hab : habitaciones){
        if (hab.getTipo() == tipo){
            boolean ocupada = false;
            for (Reserva r : reservas){
                if (r.getHabitacion().equals(hab)){
                    if (!(fin.isBefore(r.getFechaInicio()) || inicio.isAfter(r.getFechaFin()))) {
                        ocupada = true;
                        break;
                    }
                }
            }    
            if (ocupada == false){
                habitacionesDisponibles.add(hab);
            }
            }
        }
        return habitacionesDisponibles;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", habitaciones=" + habitaciones + ", recepcionistas=" + recepcionistas + ", reservas=" + reservas + '}';
    }
    
    public void mostrarReservas(){
        for (Reserva reserva : reservas){
            System.out.println(reserva);
        }
    }
    
    
            
}
