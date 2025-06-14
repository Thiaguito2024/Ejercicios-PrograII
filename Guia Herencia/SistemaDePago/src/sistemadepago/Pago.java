package sistemadepago;

public abstract class Pago {
    
    private double montoPagar;
   
    public Pago(double montoPagar) {
        this.montoPagar = montoPagar;
    }
    
    public double getMontoPagar(){
        return montoPagar;
    }
    
    public abstract double procesarPago();
}

