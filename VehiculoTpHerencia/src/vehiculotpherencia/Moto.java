package vehiculotpherencia;

public class Moto extends Vehiculo{
    
    private boolean cadenaPuesta;

    public Moto(boolean cadenaPuesta, String marca, int modelo) {
        super(marca, modelo);
        this.cadenaPuesta = cadenaPuesta;
    }

    public String mostrarDetalles() {
        return "Moto: " + "\nBloqueada " + cadenaPuesta + super.toString();
    }
}
