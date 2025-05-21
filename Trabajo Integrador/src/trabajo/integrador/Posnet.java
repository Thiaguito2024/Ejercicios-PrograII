package trabajo.integrador;

public class Posnet {

    private TarjetaDeCredito tarjeta;
    private double precioBruto;
    private int cantCuotas;
    private static final double INTERES = 0.03;

    public Posnet() {

    }

    public Posnet(TarjetaDeCredito tarjeta, double precioBruto, int cantCuotas) {
        this.tarjeta = tarjeta;
        this.precioBruto = precioBruto;
        this.cantCuotas = cantCuotas;
        checkCantCuotas();
    }
    
    private void checkCantCuotas() {
        if (cantCuotas < 1 || cantCuotas > 6) {
            throw new IllegalArgumentException ("Numero de cuotas invalido");
        }
    }

    public double calcularInteres() {
        return precioBruto * (INTERES * (cantCuotas - 1));
    }
    
    public boolean chequearSaldo() {
        double precioConRecargo = precioBruto + calcularInteres();
        double dinero = tarjeta.getSaldo();

        if (dinero >= precioConRecargo) {
            return true;
        }
        return false;
    }

    public boolean efectuarPago() {
        double precioConRecargo = precioBruto + calcularInteres();
        boolean haySaldoSuficiente = chequearSaldo();

        if (haySaldoSuficiente) {
            tarjeta.descontarSaldo(precioConRecargo);
            
            return true;
        }
        return false;
    }
     
    public double montoPorCuota() {
        return calcularInteres()/ cantCuotas;
    }
    
    public Ticket generarTicket(){
        
        if (efectuarPago()) {
            double precioConRecargo = calcularInteres();


            double montoPorCuota = precioConRecargo / cantCuotas;
            String nombre = tarjeta.getNombre();
            String apellido = tarjeta.getApellido();

            return new Ticket(nombre, apellido, precioConRecargo, montoPorCuota);
        }
        
        return null;
    }
}
