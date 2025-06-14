package sistemadepago;

public class Factura {
    
    private double monto;
    private Transaccion transaccion;

    public Factura(double monto, Transaccion transaccion) {
        this.monto = monto;
        this.transaccion = transaccion;
    }

    public void procesarPago() {
        System.out.println("Generando factura por $" + monto);
        transaccion.procesar();
        System.out.println("Pago procesado exitosamente.");
    }
}
