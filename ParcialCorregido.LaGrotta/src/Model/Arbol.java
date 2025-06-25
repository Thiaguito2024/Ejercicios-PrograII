package Model;

import Exceptions.AlturaInvalidaException;
import Interfaces.DesprenderAroma;
import Interfaces.Podable;

public class Arbol extends Planta implements Podable, DesprenderAroma{
    
    private static final int ALTURA_MINIMA = 1;
    private static final int ALTURA_MAXIMA = 10;
    private int altura;

    public Arbol(String nombre, String ubicacion, String clima, int altura) {
        super(nombre, ubicacion, clima);
        this.altura = altura;
        validarAltura(altura);
    }
    
    private void validarAltura(int altura){
        if (altura > ALTURA_MAXIMA){
            throw new AlturaInvalidaException("La altura es mayor a la permitida");
        } else {
            if (altura < ALTURA_MINIMA) {
                throw new AlturaInvalidaException("La altura es menor a la permitida");
            }
        }
    }
    
    @Override
    public void podar(){
        System.out.println("Arbol " + getNombre() + " siendo podado");
    }
    
    @Override
    public void desprenderAroma(){
        System.out.println("Arbol " + getNombre() + " desprendiendo aroma");
    }

    @Override
    public String toString() {
        return "Arbol: " + "\nAltura: " + altura + "\n" + super.toString();
    }
}
