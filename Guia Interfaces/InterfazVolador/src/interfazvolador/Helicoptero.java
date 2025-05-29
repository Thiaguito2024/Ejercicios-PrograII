package interfazvolador;

public class Helicoptero implements Volador{
    
    @Override
    public void despegar() {
        System.out.println("Helicoptero despegando");
    }
    
    @Override 
    public void aterrizar(){
        System.out.println("Helicoptero descendiendo");
    }
}
