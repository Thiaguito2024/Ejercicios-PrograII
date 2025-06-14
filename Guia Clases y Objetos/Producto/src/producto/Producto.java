package producto;

public class Producto {
    private double CAJA = 10000;
    private String nombre;
    private int precio;
    private double cantidadEnStock;
    private int descuento; 
    
    public Producto(String nombre, int precio, double cantidadEnStock, int descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.descuento = descuento;
    }
    
    public int aplicarDescuento(){
        return (precio * descuento) - precio;
    }
    
    public void hacerVenta(double cantidadVendida){
        if (cantidadVendida <= cantidadEnStock) {
            double precioFinal = aplicarDescuento();
            double totalVenta = cantidadVendida * precioFinal;
            cantidadEnStock -= cantidadVendida;
            CAJA += totalVenta;
            System.out.println("Venta realizada: $" + totalVenta);
        } else {
            System.out.println("Stock insuficiente para realizar la venta.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio sin descuento: $ " + precio +
                ", Precio con descuento: $ " + aplicarDescuento() + ", Cantidad en stock: " +
                cantidadEnStock + ", Total en caja: $ " + CAJA);
    }
}