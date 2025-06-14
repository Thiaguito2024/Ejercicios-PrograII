package cobrable;

public class Servicio implements Cobrable{
    
    @Override
    public void cobrar() {
        System.out.println("Cobrando servicios");
    }
}
