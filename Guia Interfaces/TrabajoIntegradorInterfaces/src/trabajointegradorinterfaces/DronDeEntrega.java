package trabajointegradorinterfaces;

public class DronDeEntrega extends DispositivoElectronico implements TransportadorDePaquetes {

    public DronDeEntrega(String dispositivo) {
        super(dispositivo);
    }

    @Override
    public void encendido() {
        System.out.println("El dron " + getDispositivo() + " esta despegando para hacer la entrega.");
    }

    @Override
    public void transportarPaquete(String destino) {
        encendido();
        System.out.println("El dron " + getDispositivo() + " esta entregando un paquete a " + destino);
    }
}
