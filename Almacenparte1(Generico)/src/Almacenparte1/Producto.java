package Almacenparte1;

// PRODUCTO PARTE 1: GENERICO 
public class Producto {
    
    private int id;
    private String marca;
    private Tipoproducto tipo;
    private double precio;

    public Producto(int id, String marca, Tipoproducto tipo, double precio) {
        this.id = id;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public Tipoproducto getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString() {
        return "Producto: " + "\nId " + id + "\nMarca: " + marca + "\nTipo: " + tipo + "\nPrecio: " + precio;
    }
}
