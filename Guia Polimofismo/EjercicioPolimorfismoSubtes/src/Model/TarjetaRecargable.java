package Model;

import Exceptions.SaldoInsuficienteException;

public abstract class TarjetaRecargable extends TarjetaDeViaje {
    
    private double saldo = 0;
    private Central boleto;

    public TarjetaRecargable(Central boleto) {
        this.boleto = boleto;
        System.out.println(boleto);
    }

    public void recargarSaldo(double recarga) {
        System.out.println("El saldo luego de la recarga es: " + (saldo += recarga));
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double getPrecioViaje() {
        return boleto.getPrecioViaje();
    }
    
    protected abstract double calcularPrecioViaje();

    public void pagarBoleto() {
        double precio = calcularPrecioViaje();
        if (saldo >= precio) {
            System.out.println("Saldo luego de pagar el boleto: " + (saldo -= precio));
        } else {
            throw new SaldoInsuficienteException();
        }
    }
}
