package sistemadepago;

public class Main {
    public static void main(String[] args) {
        
        Transaccion p1 = new PagoEfectivo();
        Factura f1 = new Factura(1500.00, p1);
        f1.procesarPago();

        System.out.println("---");

        Transaccion p2 = new PagoTarjeta(1234);
        Factura f2 = new Factura(3000.00, p2);
        f2.procesarPago();
        
        
    }
}
