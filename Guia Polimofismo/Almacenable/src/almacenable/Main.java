package almacenable;

public class Main {
    public static void main(String[] args) {
        
        Almacenable a = new Archivo();
        Almacenable bd = new BaseDeDatos();
        
        a.guardar();
        bd.guardar();
    }
}
