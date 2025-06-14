package dispositivoelectronico;

public class Telefono extends DispositivoElectronico {
    
    public Telefono(String marca, String modelo) {
        super(marca, modelo);
    }

    public void hacerLlamada(String numero) {
        System.out.println("Llamando al numero: " + numero);
    }
}