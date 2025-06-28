package ordenamiento3;

import java.util.Comparator;

public class ComparadorTituloOrdenInverso implements Comparator<Libro> {

    @Override
    public int compare(Libro l1, Libro l2) {
        return l2.getTitulo().compareTo(l1.getTitulo());
    }
    
}
