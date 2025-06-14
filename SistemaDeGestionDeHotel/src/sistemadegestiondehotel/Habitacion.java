package sistemadegestiondehotel;

public class Habitacion {
    
    private int numero;
    private TipoHabitacion tipo;
    private double precioPorNoche;

    public Habitacion(int numero, TipoHabitacion tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
    }
    public int getNumero() {
        return numero;
    }
    public TipoHabitacion getTipo() {
        return tipo;
    }
    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", tipo=" + tipo + ", precioPorNoche=" + precioPorNoche + '}';
    }
    
    
}
