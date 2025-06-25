package Exceptions;

public class AlturaInvalidaException extends RuntimeException{

    private static final String MESSAGE = "Altura invalida";
    
    public AlturaInvalidaException() {
        this(MESSAGE);
    }

    public AlturaInvalidaException(String MESSAGE) {
        super(MESSAGE);
    }
}
