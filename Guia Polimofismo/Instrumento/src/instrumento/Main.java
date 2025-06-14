package instrumento;

public class Main {
    public static void main(String[] args) {
        
        Instrumento v = new Violin();
        Instrumento t = new Trompeta();
        
        v.afinar();
        t.afinar();
    }
}
