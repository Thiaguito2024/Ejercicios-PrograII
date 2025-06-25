package ordenamiento;

import java.util.Comparator;

public class ComparatorPersonaGeneroAsc implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return Character.compare(p1.getGenero(), p2.getGenero());
    }
}