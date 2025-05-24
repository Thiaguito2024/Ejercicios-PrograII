package sistemadepago;

public abstract class PagoConEfectivo extends Pago{
    
    private double descuento;
    
    public PagoConEfectivo(double descuento, double montoPagar){
        super(montoPagar);
        this.descuento = descuento;
    }
    
    @Override
    public double procesarPago(){
        return super.getMontoPagar() - (descuento * super.getMontoPagar());
    }
}
