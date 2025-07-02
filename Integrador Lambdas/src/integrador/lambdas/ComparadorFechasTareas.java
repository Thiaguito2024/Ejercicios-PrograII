package integrador.lambdas;

import java.util.Comparator;

public class ComparadorFechasTareas implements Comparator<Tarea> {

    @Override
    public int compare(Tarea t1, Tarea t2) {
        return t1.getFechavencimiento().compareTo(t2.getFechavencimiento());
    }
}