package Model;

import Exceptions.FechaInvalidaException;
import Interfaces.Aprobable;
import java.time.LocalDate;

public abstract class Prueba implements Aprobable{
    
    private LocalDate fecha;
    
    public Prueba(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    public void validarFecha(LocalDate fecha) {
        if (fecha.isAfter(LocalDate.now())) {
            throw new FechaInvalidaException();
    }
}

}
