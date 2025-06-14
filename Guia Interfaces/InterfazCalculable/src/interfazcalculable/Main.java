package interfazcalculable;

public class Main {
    public static void main(String[] args) {
        
        Calculable c = new Circulo(4);
        Calculable r = new Rectangulo(4, 5);

        System.out.println("Area del circulo: " + c.calcularArea());
        System.out.println("Area del Rectangulo: " + r.calcularArea());
    }
}
