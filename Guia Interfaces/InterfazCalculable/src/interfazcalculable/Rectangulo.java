package interfazcalculable;

public class Rectangulo implements Calculable{

    private double alto;
    private double ancho;
    
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea(){
        return ancho * alto;
    }
}