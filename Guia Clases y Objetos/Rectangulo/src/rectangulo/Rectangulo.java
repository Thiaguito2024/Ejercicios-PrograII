package rectangulo;

public class Rectangulo {
    
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    } 

    public double calcularArea() {
        return ancho * alto;
    }
    
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
    
    public boolean esCuadrado() {
        return ancho == alto;
    }
     
    public Rectangulo sumar(Rectangulo o) {
        // ESTA ES LA SOLUCION ORIENTADA A OBJETOS A LA CONSIGNA PLANTEADA EN LA CLASE
        return new Rectangulo(ancho + o.ancho, alto + o.alto);
    }

    public void mostrar_info(){
        double perimetro = calcularPerimetro();
        double area = calcularArea();
        System.out.println("Tengo un ancho de: " + ancho + "\nUn alto de: " +
                alto + "\nEl perimetro es: " + perimetro + "\nEl area es: " + area 
        ); // FIJARSE COMO SE HARIA EL TERNARIO EN ESTE CASO
    }
}
