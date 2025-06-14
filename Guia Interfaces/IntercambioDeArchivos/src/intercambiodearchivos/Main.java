package intercambiodearchivos;

public class Main {
    public static void main(String[] args) {
        
        Transferencia ftp = new FTPTransferencia();
        Transferencia http = new HTTPTransferencia();

        Servidor s = new Servidor(ftp);
        Servidor s1 = new Servidor(http);
        
        s.subir();
        s.bajar();
        
        s1.subir();
        s1.bajar();
    }
}
