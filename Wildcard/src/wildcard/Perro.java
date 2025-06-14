package wildcard;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre, "Perro");
        this.raza = raza;
    }
    
    public void ladrar() {
        System.out.println("Perro ladrando");
    }

    @Override
    public String toString() {
        return "Perro: " + "\nraza: " + raza;
    }    
    
    @Override
    public void darCariño(){
        System.out.println(getNombre() + " moviendo la cola feliz");
    }
}
