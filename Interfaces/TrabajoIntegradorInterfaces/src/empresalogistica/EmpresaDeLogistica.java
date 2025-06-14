package empresalogistica;

import java.util.ArrayList;

public class EmpresaDeLogistica {
    
    private ArrayList<TransportadorDePaquetes> envios;
    
    public EmpresaDeLogistica(){
        this.envios = new ArrayList<>();
    }
    
    public void iniciarEntregar(String destino) {
        for (TransportadorDePaquetes t : envios) {
                t.transportarPaquete(destino);
        }
    }
    
    public void agregarTransportador(TransportadorDePaquetes t){
        validarAgregarTransportador(t);
        envios.add(t);
    }
    
    private void validarAgregarTransportador(TransportadorDePaquetes t){
        if (!(t instanceof TransportadorDePaquetes)) {
                throw new IllegalArgumentException("El objeto no es un TransportadorDePaquetes.");
        }
    }  
}