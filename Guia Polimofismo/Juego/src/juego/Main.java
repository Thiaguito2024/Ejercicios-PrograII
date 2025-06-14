package juego;

public class Main {
    public static void main(String[] args) {
        
        Juego a = new Ajedrez();
        Juego f = new Futbol();
        
        a.iniciar();
        f.iniciar();
    }
}
