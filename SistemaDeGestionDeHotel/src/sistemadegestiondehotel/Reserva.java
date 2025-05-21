package sistemadegestiondehotel;

import java.time.LocalDate;

public class Reserva {
    
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean confirmada;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public boolean isConfirmada() {
        return confirmada;
    }
    public void confirmar(){
        confirmada = true;
        
    }
    public double calcularTotal(){
        int dias = fechaFin.getDayOfYear() - fechaInicio.getDayOfYear();
        return dias * habitacion.getPrecioPorNoche();
    }

    @Override
    public String toString() {
        return "Reserva{" + "cliente=" + cliente + ", habitacion=" + habitacion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", confirmada=" + confirmada + '}';
    }
    
}
