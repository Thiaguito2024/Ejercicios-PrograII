package Model;

import java.time.LocalDate;

public class PruebaSistema extends Prueba{
    
    private static final NivelEvaluacion NIVEL_APROBACION = NivelEvaluacion.ACEPTABLE;
    private NivelEvaluacion nota;
    
    public PruebaSistema(LocalDate fecha, NivelEvaluacion nota){
        super(fecha);
        this.nota = nota;
    }
    
    @Override
    public boolean aprobado() {
        return nota.ordinal() >= NIVEL_APROBACION.ordinal();
    }
}
