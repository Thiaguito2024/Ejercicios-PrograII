package Model;

import java.time.LocalDate;


public class PruebaPropulsion extends Prueba{
    
    private double duracion;
    private int puntaje;
    
    private static final int LIMITE_DURACION = 90;
    private static final int NOTA_MINIMA = 0;
    private static final int NOTA_MINIMA_APROBACION = 6;
    private static final int NOTA_MAXIMA = 10;
    
    public PruebaPropulsion(double duracion, int puntaje, LocalDate fecha) {
        super(fecha);
        this.duracion = duracion;
        this.puntaje = puntaje;
        validarPuntaje(puntaje);
    }

    @Override
    public boolean aprobado() {
        return puntaje >= NOTA_MINIMA_APROBACION && duracion < LIMITE_DURACION;
    }
    
    private void validarPuntaje(int puntaje){
        if (puntaje < NOTA_MINIMA|| puntaje > NOTA_MAXIMA) {
            throw new IllegalArgumentException("Puntaje Invalido");
        }
    }    
}