package Model;

public class TarjetaDeViajeRecargableConDescuento extends TarjetaRecargable{
    
    private static final double TARIFA_DESCUENTO = 0.50;
    private double saldo = 0;
    
    
    public TarjetaDeViajeRecargableConDescuento(Central boleto) {
        super(boleto);
    }
    
    @Override
    protected double calcularPrecioViaje() {
        return (saldo - (getPrecioViaje() * TARIFA_DESCUENTO));
    }
}