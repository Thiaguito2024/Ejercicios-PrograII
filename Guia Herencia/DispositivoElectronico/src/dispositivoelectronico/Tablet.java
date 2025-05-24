package dispositivoelectronico;

public class Tablet extends DispositivoElectronico {
 
    public Tablet(String marca, String modelo) {
        super(marca, modelo);
    }

    public void verVideo(String titulo) {
        System.out.println("Reproduciendo video: " + titulo);
    }
}