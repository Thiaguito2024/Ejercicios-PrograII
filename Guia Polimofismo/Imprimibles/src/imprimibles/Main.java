package imprimibles;

public class Main {
    public static void main(String[] args) {
        
        Imprimible i = new Informe();
        Imprimible f = new Factura();
        
        i.imprimir();
        f.imprimir();
    }
}
