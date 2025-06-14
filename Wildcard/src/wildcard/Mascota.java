package wildcard;

public class Mascota extends Animal implements Amigable{
    
    private String nombre;

    public Mascota(String nombre, String especie) {
        super(especie);
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void vacunar(){
        System.out.println("Vacunando a " + nombre);
    }

    @Override
    public String toString() {
        return "Mascota: " + "\nNombre: " + nombre + "\nEspecie: " + getEspecie();
    }

    @Override
    public void darCariño() {
        System.out.println("Acariciando a " + nombre);
    }
}
