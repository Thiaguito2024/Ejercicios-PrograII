package ordenamiento;

import java.util.Comparator;

public class ComparadorPersonaNacionalidad implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNacionalidad().compareTo(p2.getNacionalidad());
    }
}