package wildcard;

public class Persona implements Amigable {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public void darCariño(){
        System.out.println("Abrazando a " + nombre);
    }

    @Override
    public String toString() {
        return "Persona: " + "\nnombre: " + nombre + ", edad: " + edad;
    }
}
