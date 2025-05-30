package interfazimprimible;

public class Foto implements Imprimible{
    
    @Override 
    public void imprimir() {
        System.out.println("Imprimiendo la foto");
    }
}
