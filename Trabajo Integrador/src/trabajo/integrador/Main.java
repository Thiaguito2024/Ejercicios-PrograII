package trabajo.integrador;

public class Main {

    public static void main(String[] args) {
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("Visa", "Banco Nacion", 01, 30000, 1234, "Thiago", "La Grotta", 111111, "mail@gmail");
        
        Posnet posnet = new Posnet(tarjeta, 20000, 5);
        
        Ticket ticket = new Ticket("Thiago", "La Grotta", 20000, posnet.montoPorCuota()); 
       
        if (posnet.generarTicket() != null) {
            System.out.println("Pago realizado con exito");
        } else {
            System.out.println("Pago no realizado");
        }
    }
}
