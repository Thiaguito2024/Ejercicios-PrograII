package intercambiodearchivos;

public class FTPTransferencia implements Transferencia{
    
    
    @Override
    public void subir(){
        System.out.println("Subiendo archivo FTP");
    }
    
    public void bajar(){
        System.out.println("Bajando archivo FTP");
    }
}
