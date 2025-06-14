package cuentaBancaria;

public class CuentaBancaria {
    private int saldo;
    private String titular;
    private int numeroDeCuenta;
    
    public CuentaBancaria(int saldo, String titular, int numeroDeCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    public double depositarDinero(double deposito){
        return this.saldo += deposito;
    }
    
    private boolean validarRetiro(double retiro){
        if (retiro > this.saldo) {
            return false;
        } else { 
            return true;
        }
    }
    
    public double retirarDinero(double retiro){
        if (validarRetiro(retiro)) {
            return this.saldo -= retiro;
        }
        return 0;
    }
    
    
    public void mostrarInfo(){
        System.out.println("El saldo disponible es: " + saldo);
    }
}
