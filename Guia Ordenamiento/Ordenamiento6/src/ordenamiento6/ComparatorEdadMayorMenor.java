package ordenamiento6;

import java.util.Comparator;

public class ComparatorEdadMayorMenor implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante e1, Estudiante e2) {
        return Integer.compare(e2.getEdad(), e1.getEdad());
    }
}