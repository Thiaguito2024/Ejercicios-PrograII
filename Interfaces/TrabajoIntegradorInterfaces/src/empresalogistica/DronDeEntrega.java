package empresalogistica;

public class DronDeEntrega extends DispositivoElectronico implements TransportadorDePaquetes{

    public DronDeEntrega(String dispositivo){
        super(dispositivo);
    }
    
    @Override
    public void encendido(){
        System.out.println("El dispositivo electronico " + getDispositivo() + " esta encendido");
    }
    
    @Override
    public void transportarPaquete(String destino) {
        System.out.println("El Dron: " + getDispositivo() + " esta entregando el paquete en " + destino);
    }
}
