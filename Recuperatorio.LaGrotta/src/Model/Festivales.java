package Model;

import Interfaces.Transmitible;
import java.time.LocalDate;

public class Festivales extends Espectaculos implements Transmitible{
    
    private int cantEspectaculos;
    private boolean zonaCamping = false;

    public Festivales(String nombre, LocalDate fecha, int duracion, int cantEspectaculos, boolean zonaCamping) {
        super(nombre, fecha, duracion);
        this.cantEspectaculos = cantEspectaculos;
        this.zonaCamping = zonaCamping;
    }

    @Override
    public String toString() {
        return super.toString() + "Festivales{" + "cantEspectaculos=" + cantEspectaculos + ", zonaCamping=" + zonaCamping + '}';
    }

    @Override
    public void transmitir() {
        System.out.println("Soy un festival y me estan transmitiendo");
    }
}
