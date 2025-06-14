package trabajointegradorinterfaces;

public class PersonaMensajera implements TransportadorDePaquetes {

    public void paqueteEntregado() {
        System.out.println("Paquete entregado por mensajero a pie.");
    }

    @Override
    public void transportarPaquete(String destino) {
        System.out.println("Persona mensajera esta yendo a pie hacia " + destino);
        paqueteEntregado();
    }
}
