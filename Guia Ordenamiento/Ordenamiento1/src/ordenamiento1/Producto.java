package ordenamiento1;

public class Producto implements Comparable<Producto>{
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto p) {
        return Double.compare(precio, p.getPrecio());
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio;
    }
    
}
