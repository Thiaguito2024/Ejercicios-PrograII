package trabajointegradorinterfaces;

public class CamionDeReparto extends Vehiculo implements TransportadorDePaquetes {
    
    private String idCamion;
    private String nombre;

    public CamionDeReparto(String idCamion, String nombre) {
        this.idCamion = idCamion;
        this.nombre = nombre;
    }

    public void cargarPaquete() {
        System.out.println("Cargando paquete en el camion: " + nombre);
    }

    @Override
    public void transportarPaquete(String destino) {
        cargarPaquete();
        conducirRapido();
        System.out.println("Entregando paquete con el camion " + nombre + " hacia " + destino);
    }
}
