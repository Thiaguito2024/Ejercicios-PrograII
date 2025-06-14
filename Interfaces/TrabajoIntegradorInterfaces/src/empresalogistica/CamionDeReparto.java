package empresalogistica;

public class CamionDeReparto extends Vehiculo implements TransportadorDePaquetes{
    
    private String idCamion;
    private String nombre;
    
    public CamionDeReparto(String idCamion, String nombre) {
        super();
        this.idCamion = idCamion;
        this.nombre = nombre;
    }
    
    public void cargarPaquete() {
        System.out.println("El camion " + idCamion + " a cargo de " + nombre + " esta cargando un paquete");
    }
    
    @Override
    public void transportarPaquete(String destino) {
        System.out.println("Camion " + idCamion + " entregando paquete en " + destino);
    }
    
}
