package dispositivoelectronico;

public class Main {
    public static void main(String[] args) {
        
        DispositivoElectronico tm = new TelefonoMovil();
        DispositivoElectronico t = new Televisor();
        
        tm.encender();
        t.encender();
    }
}
