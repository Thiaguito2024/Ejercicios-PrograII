package interfazpagable;

public class Empleado implements Pagar{
    
    @Override 
    public void pagar(){
        System.out.println("Soy un empleado y estoy pagando");
    }
}
