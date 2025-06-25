package Model;

import Enum.Clasificacion;
import Interfaces.Calificable;
import java.time.LocalDate;

public class ObrasTeatrales extends Espectaculos implements Calificable{
    
    private String nombreDirector;
    private Clasificacion clasificacion;

    public ObrasTeatrales(String nombre, LocalDate fecha, int duracion, Clasificacion clasificacion, String nombreDirector) {
        super(nombre, fecha, duracion);
        this.nombreDirector = nombreDirector;
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return super.toString() + "ObrasTeatrales{" + "nombreDirector=" + nombreDirector + '}';
    }
    
    @Override
    public void calificar(int puntaje) {
        System.out.println("Soy una obra Teatral y obtuve " + puntaje + " puntos");
    }
}
