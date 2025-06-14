package persona; 

public class Persona {
    private String nombre;
    private int edad; 
    private double altura;
    private double peso; 
    
    public Persona(String nombre, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    
    public boolean mayorEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    
    public void mostrarInfo() {
        System.out.println("Soy " + nombre + ", mido " + altura + "cm," +
            " tengo " + edad + " y peso " + peso + " kilos");
    }
}
