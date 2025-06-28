package ordenamiento7;

import java.util.Comparator;

public class ComparatorJuegoAlfabeticamente implements Comparator<Juego>{

    @Override
    public int compare(Juego j1, Juego j2) {
        return j1.getTitulo().compareTo(j2.getTitulo());
    }
    
}
