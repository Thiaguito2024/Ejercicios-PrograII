package intercambiodearchivos;

public class HTTPTransferencia implements Transferencia{
    
    
    @Override
    public void subir(){
        System.out.println("Subiendo archivo HTTP");
    }
    
    public void bajar(){
        System.out.println("Bajando archivo HTTP");
    }
}
