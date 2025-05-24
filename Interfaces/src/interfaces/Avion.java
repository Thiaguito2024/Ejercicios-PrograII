package interfaces;

public class Avion implements Volador{

    private String matricula;
    private String marca;
    private int cantPasajeros;

    public Avion(String matricula, String marca, int cantPasajeros) {
        this.matricula = matricula;
        this.marca = marca;
        this.cantPasajeros = cantPasajeros;
    }
    
    public void subiendoTrenAterrizaje(){
        System.out.println("Subiendo tren aterrizaje");
    }

    public void bajandoTrenAterrizaje(){
        System.out.println("Bajando tren aterrizaje");
    }
    
    @Override
    public void despegar() {
        System.out.println("Avion despegando"); 
        subiendoTrenAterrizaje();
    }

    @Override
    public void aterrizar() {
        bajandoTrenAterrizaje();
        System.out.println("Avion aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("Avion volando");
    }

    @Override
    public String toString() {
        return "Avion: " + "\nMatricula=" + matricula + "\nMarca=" + marca + "\nCantidad de pasajeros=" + cantPasajeros;
    }
}
