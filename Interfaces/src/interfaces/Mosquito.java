package interfaces;

public class Mosquito implements Volador {

    private String especie;
    private int diasDeVida;
    private char genero;

    public Mosquito(String especie, int diasDeVida, char genero) {
        this.especie = especie;
        this.diasDeVida = diasDeVida;
        this.genero = genero;
    }

    public void picar(){
        System.out.println("Soy un mosquito y te estoy picando");
    }
    
    @Override
    public void despegar() {
        System.out.println("Mosquito despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("Mosquito aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("Soy un mosquito y vuelo cerda de tu oido");
    }
    
    
}
