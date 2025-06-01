package Model;

import Exceptions.TarjetaInvalidaException;
import java.util.ArrayList;

public class Central {
     
    private double precioViaje;
    private ArrayList<TarjetaDeViaje> tarjetas;
    
    public Central(double precioViaje) {
        this.precioViaje = precioViaje;
        this.tarjetas = new ArrayList<>();
    }
    
    public void aumentarBoleto(double aumento){
        System.out.println("El valor actualizado del boleto es: " + (precioViaje += aumento));
    }
    
    public double getPrecioViaje(){
        return precioViaje;
    }
    
    public void getSaldoTarjetas(){
        for (TarjetaDeViaje t : tarjetas) {
            System.out.println("Saldo: " + t.getSaldo());
        }
    }

    public void agregarTarjeta(TarjetaDeViaje t){
        validarAgregarTarjeta(t);
        tarjetas.add(t);
    }
    
    private void validarAgregarTarjeta(TarjetaDeViaje t) {
        if (!(t instanceof TarjetaDeViaje) || t == null) {
            throw new TarjetaInvalidaException();
        }
    }
}
