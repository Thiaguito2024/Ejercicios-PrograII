package Exceptions;

public class TarjetaInvalidaException extends RuntimeException {
    
    private static final String MESSAGE = "Tipo de dato invalido";

    public TarjetaInvalidaException() {
        this(MESSAGE);
    }

    public TarjetaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
