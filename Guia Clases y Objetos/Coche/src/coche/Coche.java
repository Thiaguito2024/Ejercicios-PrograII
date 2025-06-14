package coche;

public class Coche {
    private double consumoPorKm = 0.08;
    private String marca;
    private String modelo;
    private int kilometraje;
    private double combustibleRestante;
    
    public Coche(String marca, String modelo, int kilometraje, double combustibleRestante) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.combustibleRestante = combustibleRestante;
    }
    
    public double kilometrosRestantes(){
        return combustibleRestante / consumoPorKm;
    }
    
    public double cargarNafta(double recarga){
        return combustibleRestante + recarga;
    }
    
    public void mostrarInfo(){
        double kilometrosRestantes = kilometrosRestantes(); 
        System.out.println("Soy un auto de la marca: " + marca + ", modelo: " + modelo +
            ", tengo " + kilometraje + " km y puedo recorrer aproximadamente " + kilometrosRestantes +
            " km con el combustible actual.");
    }
}
