package ordenamiento;

import java.util.Comparator;


public class ComparatorPersonaNomrbeAsc implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
}