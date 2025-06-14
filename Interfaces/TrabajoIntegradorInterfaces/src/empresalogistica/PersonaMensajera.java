package empresalogistica;

public class PersonaMensajera implements TransportadorDePaquetes{
    
    public void paqueteEntregado(){
        System.out.println("Paquete entregaaado a pie");
    }
    
    @Override
    public void transportarPaquete(String destino) {
        System.out.println("Entregando paquete en " + destino + " a pie");
    }
}
