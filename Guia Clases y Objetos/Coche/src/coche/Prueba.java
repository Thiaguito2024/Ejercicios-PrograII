package coche;

public class Prueba {
    public static void main(String[] args) {
        Coche c1;
        
        c1 = new Coche("Ford", "Mondeo", 10000, 80);
        
        c1.mostrarInfo();
        c1.cargarNafta(20);

    }
}
