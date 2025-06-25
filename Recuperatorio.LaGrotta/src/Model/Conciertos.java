package Model;

import Enum.Genero;
import Interfaces.Calificable;
import Interfaces.Transmitible;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Conciertos extends Espectaculos implements Transmitible, Calificable{
        
    private List<String> artistas;
    private Genero genero;

    public Conciertos(String nombre, LocalDate fecha, int duracion, Genero genero, List<String> artistas) {
        super(nombre, fecha, duracion);
        this.artistas = artistas;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + "Concierto{" + "artistas=" + artistas + ", genero=" + genero + '}';
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public void transmitir() {
        System.out.println("Soy un concierto y me estan transmitiendo");
    }

    @Override
    public void calificar(int puntaje) {
        System.out.println("Soy un concierto y obtuve " + puntaje + " puntos");
    }
}
