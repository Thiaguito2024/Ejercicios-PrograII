package animal;

public abstract class Elefante extends Animal{
    
    public Elefante(String especie, int edad) {
        super(especie, edad);
    }
    
    @Override
    public void alimentarse(){
        System.out.println("Elefante comiendo hojas");
    }
    
}
