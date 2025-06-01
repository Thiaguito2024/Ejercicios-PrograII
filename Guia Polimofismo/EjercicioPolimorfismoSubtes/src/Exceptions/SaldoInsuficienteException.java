package Exceptions;

public class SaldoInsuficienteException extends RuntimeException{
    
    private static final String MESSAGE = "Saldo insuficiente";
    
    public SaldoInsuficienteException(){
        this(MESSAGE);
    }
    
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
