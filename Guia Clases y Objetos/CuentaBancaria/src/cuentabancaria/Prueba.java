package cuentaBancaria;

public class Prueba {
    public static void main(String[] args) {
        CuentaBancaria cb1;
        
        cb1 = new CuentaBancaria(10000, "Thiago", 0001);
        
        System.out.println("Saldo inicial: ");
        cb1.mostrarInfo();

        System.out.println("\nSaldo despues de deposito: ");
        cb1.depositarDinero(20000);
        cb1.mostrarInfo();
        
        System.out.println("\nSaldo despues de retiro: ");
        cb1.retirarDinero(5000);
        cb1.mostrarInfo();

    }
}
