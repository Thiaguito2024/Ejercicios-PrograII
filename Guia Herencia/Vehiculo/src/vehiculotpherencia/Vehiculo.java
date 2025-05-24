package vehiculotpherencia;

public class Vehiculo {
    private String marca;
    private int modelo; 

    public Vehiculo(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return " \nVehiculo: " + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
    
    
}