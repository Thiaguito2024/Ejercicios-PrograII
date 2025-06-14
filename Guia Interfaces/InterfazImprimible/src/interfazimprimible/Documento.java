package interfazimprimible;

public class Documento implements Imprimible{
    
    @Override
    public void imprimir(){
        System.out.println("Imprimiendo el documento");
    }
}
