package Exceptions;

public class EspectaculoRepetidoException extends RuntimeException {
    private static final String MESSAGE = "Este concierto ya esta anotado";

    public EspectaculoRepetidoException() {
        this(MESSAGE);
    }

    public EspectaculoRepetidoException(String MESSAGE) {
        super(MESSAGE);
    }
}
