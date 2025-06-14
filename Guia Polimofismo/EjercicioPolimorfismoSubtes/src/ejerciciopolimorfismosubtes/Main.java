package ejerciciopolimorfismosubtes;

import Model.Central;
import Model.TarjetaDeViajeConSaldo;
import Model.TarjetaDeViajeDesechable;
import Model.TarjetaDeViajeRecargableConDescuento;

public class Main {
    public static void main(String[] args) {
        
        Central c = new Central(500);
        
        TarjetaDeViajeConSaldo tcs = new TarjetaDeViajeConSaldo(c);
        TarjetaDeViajeDesechable tvd = new TarjetaDeViajeDesechable(c);
        TarjetaDeViajeRecargableConDescuento tvrd = new TarjetaDeViajeRecargableConDescuento(c); 
        
        
        c.agregarTarjeta(tcs);
        c.agregarTarjeta(tvd);
        c.agregarTarjeta(tvrd);
        c.getSaldoTarjetas();
        
        //System.out.println("precio viaje "+ c.getPrecioViaje());
        
        System.out.println("-------------------------------");
        tcs.recargarSaldo(2000);
        tcs.pagarBoleto();
        
        System.out.println("-------------------------------");
        tvd.pagarBoleto();
        tvd.getSaldo();
        
        System.out.println("-------------------------------");
        tvrd.recargarSaldo(2000);
        tvrd.pagarBoleto();
        tvrd.getSaldo();
    }
}
