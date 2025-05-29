package sistemadepago;

public class PagoTarjeta implements Transaccion {
    
    private int numeroTarjeta;

    public PagoTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando pago con tarjeta: " + numeroTarjeta);
    }
}

