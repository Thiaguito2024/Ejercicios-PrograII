package dispositivoelectronico;

public class DispositivoElectronico {
    
    private String marca;
    private String modelo;

    public DispositivoElectronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }
}
