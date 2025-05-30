package trabajointegradorinterfaces;

import java.util.ArrayList;

public class EmpresaLogistica {
    private ArrayList<TransportadorDePaquetes> envios;

    public EmpresaLogistica() {
        envios = new ArrayList<>();
    }

    public void agregarTransportador(TransportadorDePaquetes t) {
        validarAgregarTransportador(t);
        envios.add(t);
    }

    public void iniciarEntrega(String destino) {
        for (TransportadorDePaquetes t : envios) {
            t.transportarPaquete(destino);
        }
    }

    private void validarAgregarTransportador(TransportadorDePaquetes t) {
        if (!(t instanceof TransportadorDePaquetes)) {
            throw new IllegalArgumentException("Objeto de tipo incorrecto");
        }
    }
}
