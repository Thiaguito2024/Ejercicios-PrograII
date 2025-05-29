package mensajes;

public class Main {
    public static void main(String[] args) {
        
        Mensaje m = new Mail();
        Mensaje s = new SMS();
        
        m.enviar();
        s.enviar();
    }
}
