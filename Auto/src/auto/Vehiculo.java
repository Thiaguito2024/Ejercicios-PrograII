package auto;

public abstract class Vehiculo {
    
    private String patente;
    private String marca;
    private int modelo;

    public Vehiculo(String patente, String marca, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPatente(){
        return patente;
    }
    
    public abstract void acelerar();
    
    public abstract void frenar();
    
    @Override
    public String toString() {
        return "Vehiculo: " + "patente; " + patente + ", marca; " + marca + 
                ", modelo; " + modelo + '}';
    }
}
