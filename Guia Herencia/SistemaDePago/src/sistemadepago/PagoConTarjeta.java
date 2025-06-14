package sistemadepago;

public abstract class PagoConTarjeta extends Pago{
    
    private double interes; 
    
    public PagoConTarjeta(double montoPagar, double interes) {
        super(montoPagar);
        this.interes = interes; 
    }
    
    @Override
    public double procesarPago() {
        return super.getMontoPagar() + (interes * super.getMontoPagar());
    }
}
