package auto;

public class Moto extends Vehiculo {
    
    private boolean eslingaPuesta;
    
    public Moto(String patente, String marca, int modelo){
        super(patente, marca, modelo);
    }
    
    public void bloquear(){
        if (!eslingaPuesta){
            eslingaPuesta = true;
        }
    }
    
    @Override
    public void acelerar() {
        System.out.println("Motp acelerando");        
    }
    
    @Override
    public void frenar(){
        System.out.println  ("Moto frenando");
    }
}
