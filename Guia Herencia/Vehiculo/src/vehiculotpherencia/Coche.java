package vehiculotpherencia;

public class Coche extends Vehiculo{
    
    private int cantKilometros; 

    public Coche(int cantKilometros, String marca, int modelo) {
        super(marca, modelo);
        this.cantKilometros = cantKilometros;
    }

    public String mostrarDetalles() {
        return "Coche: " + "\nCantidad de kilometros: " + cantKilometros + super.toString();
    }

}
