package Exceptions;

public class DensidadFollajeInvalidaException extends RuntimeException{
    
    private static final String MESSAGE = "Densidad de follaje invalida";

    public DensidadFollajeInvalidaException() {
        this(MESSAGE);
    }

    public DensidadFollajeInvalidaException(String MESSAGE) {
        super(MESSAGE);
    }
}
