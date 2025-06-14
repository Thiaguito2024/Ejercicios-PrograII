package Model;

import Exceptions.SaldoInsuficienteException;

public class TarjetaDeViajeConSaldo extends TarjetaRecargable{
    
    private double saldo = 0;

    public TarjetaDeViajeConSaldo(Central boleto) {
        super(boleto);
    }
  
    @Override
    protected double calcularPrecioViaje() {
        return getPrecioViaje();
    }
}
