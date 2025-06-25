package Model;

import Exceptions.DensidadFollajeInvalidaException;
import Interfaces.Podable;

public class Arbusto extends Planta implements Podable{

    private static final double DENSIDAD_FOLLAJE_MINIMA = 1;
    private static final double DENSIDAD_FOLLAJE_MAXIMA = 10;
    private double follaje;

    public Arbusto(String nombre, String ubicacion, String clima, double follaje) {
        super(nombre, ubicacion, clima);
        this.follaje = follaje;
        validarDensidadFolaje(follaje);
    }
    
    private void validarDensidadFolaje(double follaje){
        if (follaje > DENSIDAD_FOLLAJE_MAXIMA){
            throw new DensidadFollajeInvalidaException("La densidad del follaje es mayor a la permitida");
        } else {
            if (follaje < DENSIDAD_FOLLAJE_MINIMA) {
                throw new DensidadFollajeInvalidaException("La densidad del follaje es menor a la permitida");
            }
        }
    }
    
    @Override
    public void podar(){
        System.out.println("Arbusto " + getNombre() + " siendo podado");
    }

    @Override
    public String toString() {
        return "Arbusto: " + "\nFollaje: " + follaje + "\n" + super.toString();
    }
    
}
