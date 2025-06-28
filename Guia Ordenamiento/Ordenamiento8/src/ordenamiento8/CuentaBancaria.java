package ordenamiento8;

public class CuentaBancaria implements Comparable<CuentaBancaria> {
    
    private String numeroDeCuenta;
    private double saldo;

    public CuentaBancaria(String numeroDeCuenta, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public int compareTo(CuentaBancaria c) {
        return Double.compare(saldo, c.getSaldo());
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroDeCuenta=" + numeroDeCuenta + ", saldo=" + saldo + '}';
    }

}