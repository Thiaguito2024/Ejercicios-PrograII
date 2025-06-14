package interfaznadador;

public class Main {
    public static void main(String[] args) {
        
        Nadador pez = new Pez();
        Nadador persona = new Persona();
        
        pez.nadar();
        persona.nadar();
    }
}
