package Model;

import Exceptions.SaldoInsuficienteException;

public class TarjetaDeViajeDesechable extends TarjetaDeViajeConSaldo{
    
    private static final int CANT_VIAJES_DISP = 10;
    
    public TarjetaDeViajeDesechable(Central boleto) {
        super(boleto);
    }
    
    @Override
    public double getSaldo(){
        return CANT_VIAJES_DISP;
    }
    
    @Override
    public void pagarBoleto(){
        validarViajesDisp();
        System.out.println("Cantidad de viajes disponibles: " + (CANT_VIAJES_DISP - 1));
    }
    
    private void validarViajesDisp() {
        if (CANT_VIAJES_DISP == 0) {
            throw new SaldoInsuficienteException();
        }
    }
}
