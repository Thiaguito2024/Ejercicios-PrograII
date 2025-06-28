package ordenamiento8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<CuentaBancaria> CuentaBancaria = new ArrayList<>();
        CuentaBancaria c1 = new CuentaBancaria("001A", 1500.50);
        CuentaBancaria c2 = new CuentaBancaria("003C", 500.00);
        CuentaBancaria c3 = new CuentaBancaria("002B", 3200.75);
        CuentaBancaria c4 = new CuentaBancaria("004D", 500.00);
        agregar(CuentaBancaria, c1);
        agregar(CuentaBancaria, c2);
        agregar(CuentaBancaria, c3);
        agregar(CuentaBancaria, c4);
        mostrarLista(CuentaBancaria);
        
        System.out.println("Ordenando por saldo de menor a mayor: ");
        Collections.sort(CuentaBancaria);
        mostrarLista(CuentaBancaria);
        
        System.out.println("Ordenando por numero de cuenta descendente. ");
        CuentaBancaria.sort(new ComparadorPorNumeroDeCuentaDesc());
        mostrarLista(CuentaBancaria);
    }
    public static void mostrarLista(List<?> lista){
        for (Object o : lista) {
            System.out.println(o); 
        } 
        System.out.println("\n-----------------------------");
    }    
    
    public static <T> void agregar(List<T> lista, T elemento){
        lista.add(elemento);
    }    
}
