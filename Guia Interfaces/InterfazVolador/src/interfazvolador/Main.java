package interfazvolador;

public class Main {
    public static void main(String[] args) {
        
        Volador a = new Avion();
        Volador h = new Helicoptero();
        
        a.despegar();
        a.aterrizar();
        
        h.despegar();
        h.aterrizar();
    }
}
