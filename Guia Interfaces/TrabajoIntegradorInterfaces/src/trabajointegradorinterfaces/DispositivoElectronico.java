package trabajointegradorinterfaces;

public class DispositivoElectronico {
    
    private String dispositivo;

    public DispositivoElectronico(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void encendido() {
        System.out.println("Encendiendo el dispositivo: " + dispositivo);
    }

    public String getDispositivo() {
        return dispositivo;
    }
}
