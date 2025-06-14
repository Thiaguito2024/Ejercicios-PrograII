package trabajointegradorlistas;
    
public class DispositivosElectronicos {
    
    private String id;
    private double precio;
    private TipoDispositivo tipo;
    
    public DispositivosElectronicos(String id, double precio, TipoDispositivo tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    public TipoDispositivo getTipo() {
        return tipo;
    }
    
    public String getId() {
        return id;
    }
    
    public boolean tieneId(String id) {
        return this.id.equals(id);
    }
    
    @Override
    public String toString() {
        return "Dispositivo Electronico: " + "\nID: " + id +
                "\nPrecio: " + precio + "\nTipo: " + tipo + "\n";
    }
}
