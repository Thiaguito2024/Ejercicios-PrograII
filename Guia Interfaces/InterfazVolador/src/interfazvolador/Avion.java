package interfazvolador;

public class Avion implements Volador {
    
    @Override
    public void despegar() {
        System.out.println("Avion carreteando");
    }
    
    @Override
    public void aterrizar(){
        System.out.println("Desplegando tren de aterrizaje");
    }
}
