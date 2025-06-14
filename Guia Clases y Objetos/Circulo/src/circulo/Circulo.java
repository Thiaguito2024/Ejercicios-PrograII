package circulo;

public class Circulo {
    private final double PI = 3.1416;
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return PI * (radio * radio);
    }
    
    public double calcularCircunferencia(){
        return 2 * PI * radio;
    }
    
    public double escalarRadio(double porcentaje) {
        return radio + (radio * (porcentaje / 100));
    }
    
    public void mostrarInfo(){
        double area = calcularArea();
        double circunferencia = calcularCircunferencia();
        System.out.println("El area es: " + area +
                " y la circunferencia es: " + circunferencia);

    }
}
