package Exceptions;

public class FechaInvalidaException extends RuntimeException{
    
    private static final String MESSAGE = "Fecha Invalida";
    
    public FechaInvalidaException(){
        this(MESSAGE);
    }
    
    public FechaInvalidaException(String mensaje){
        super(mensaje);
    }
    
}