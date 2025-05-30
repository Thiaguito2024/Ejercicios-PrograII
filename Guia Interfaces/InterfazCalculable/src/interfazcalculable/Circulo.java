package interfazcalculable;

public class Circulo implements Calculable{
    
    private final double PI = 3.1416;
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return PI * (radio * radio);
    }
}
