package Exceptions;

public class PlantaRepetidaException extends RuntimeException{
    
    private static final String MESSAGE = "Esta planta ya esta en su jardin!";
    
    public PlantaRepetidaException() {
        this(MESSAGE);
    }

    public PlantaRepetidaException(String MESSAGE) {
        super(MESSAGE);
    }
}
