package ordenamiento8;

import java.util.Comparator;

public class ComparadorPorNumeroDeCuentaDesc implements Comparator<CuentaBancaria> {

    @Override
    public int compare(CuentaBancaria c1, CuentaBancaria c2) {
        return c1.getNumeroDeCuenta().compareTo(c2.getNumeroDeCuenta());
    }
    
}
