package cobrable;

public class Producto implements Cobrable{
    
    @Override
    public void cobrar(){
        System.out.println("Cobrando producto x");
    }
   
}
