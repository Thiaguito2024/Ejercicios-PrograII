package imprimibles;

public class Factura implements Imprimible{
    
    @Override
    public void imprimir(){
        System.out.println("Imprimiendo factura");
    }
}
