package cobrable;

public class Main {
    public static void main(String[] args) {
        
        Cobrable s = new Servicio();
        Cobrable p = new Producto();
        
        s.cobrar();
        p.cobrar();
    }
}