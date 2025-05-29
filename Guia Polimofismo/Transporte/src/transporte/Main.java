package transporte;

public class Main {
    public static void main(String[] args) {
        
        Transporte a = new Avion();
        Transporte b = new Barco();
        
        a.viajar();
        b.viajar();
    }
}
