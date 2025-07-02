package integrador.lambdas;

import java.time.LocalDate;

public class Tarea {
    
    private static final int PRIORIDAD_MINIMA = 1;  
    private static final int PRIORIDAD_MAXIMA = 3;  
    private String nombre; 
    private boolean completada;
    private LocalDate fechavencimiento;
    private int duracion;
    private int prioridad;

    public Tarea(String nombre, boolean completada, LocalDate fechavencimiento, int duracion, int prioridad) {
        this.nombre = nombre;
        this.completada = completada;
        this.fechavencimiento = fechavencimiento;
        this.duracion = duracion;
        this.prioridad = prioridad;
        validarPrioridad(prioridad);
    }

    private void validarPrioridad(int prioridad){
      if(PRIORIDAD_MINIMA < 1 || PRIORIDAD_MAXIMA > 3) {
          throw new IllegalArgumentException("Prioridad Invalida");
      }
    }
    
    @Override
    public String toString() {
        return "Tareas{" + "nombre=" + nombre + ", completada=" + completada + ", fechavencimiento=" + fechavencimiento + ", duracion=" + duracion + ", prioridad=" + prioridad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public LocalDate getFechavencimiento() {
        return fechavencimiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getPrioridad() {
        return prioridad;
    }
}