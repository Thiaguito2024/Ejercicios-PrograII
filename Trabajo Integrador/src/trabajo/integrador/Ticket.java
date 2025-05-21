package trabajo.integrador;

public class Ticket {
    
    private String nombreCliente;
    private String apellidoCliente;
    private double montoTotal;
    private double montoPorCuota;
    private TarjetaDeCredito tarjeta;
    private Posnet p;

    public Ticket(String nombreCliente, String apellidoCliente, double montoTotal, double montoPorCuota) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }
    
    @Override
    public String toString(){
        return "TICKET: \n" +
                "Cliente: " + nombreCliente + "\n" +
                "Apellido: " + apellidoCliente + "\n" +
                "Monto. " + montoTotal + "\n";
    }
   
}
