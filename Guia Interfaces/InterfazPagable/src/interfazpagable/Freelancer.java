package interfazpagable;

public class Freelancer implements Pagar{
    
    @Override
    public void pagar(){
        System.out.println("Soy un freelancer y estoy pagando");
    }
}
