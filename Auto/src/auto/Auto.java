package auto;

public class Auto extends Vehiculo {
    
    private boolean tieneGPS;
    
    public Auto(String patente, String marca, int modelo){
        super(patente, marca, modelo);
    }
    
    public void addGPS(){
        tieneGPS = true;
    }
    
    public void calcularRuta(){
        if (tieneGPS){
            System.out.println("Calculando ruta");
        } else {
            System.out.println("No tiene GPS");
        }
    }

    @Override
    public String toString() {
        String mensaje = super.toString();
        return "Auto: " + "tieneGPS; " + tieneGPS + mensaje;
    }
    
    @Override
    public void acelerar() {
        System.out.println("Auto acelerando");
    }
    
    @Override
    public void frenar(){
        System.out.println  ("Auto frenando");
    }
}
