package ordenamiento5;

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
        int comparacionPrecio = Double.compare(precio, p.getPrecio());
        if (comparacionPrecio == 0) {
            return nombre.compareTo(p.getNombre());
        }
        return comparacionPrecio;
     }


    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio;
    }
    
}
