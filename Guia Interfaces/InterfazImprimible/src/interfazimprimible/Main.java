package interfazimprimible;

public class Main {
    public static void main(String[] args) {
        
        Imprimible d = new Documento();
        Imprimible f = new Foto();
        
        d.imprimir();
        f.imprimir();
    }
}
