package sistemadepago;

public class Main {
    
    public static void main(String[] args) {

        PagoConTarjeta t = new PagoConTarjeta(3320, 0.10){};
        
        double precioConRecargo = t.procesarPago();
        
        System.out.println("El precio con tarjeta es: " + precioConRecargo); 
        
        System.out.println("------------------------------------");
        
        PagoConEfectivo e = new PagoConEfectivo(0.10, 3320){};
        
        double precioConDescuento = e.procesarPago();
        
        System.out.println("El precio con efectivo es: " + precioConDescuento); 

    }    
}
