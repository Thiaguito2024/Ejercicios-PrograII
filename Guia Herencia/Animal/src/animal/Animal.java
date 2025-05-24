package animal;

public abstract class Animal {
    
    private String especie;
    private int edad;
    
    public Animal(String especie, int edad){
        this.edad = edad;
        this.especie = especie;
    }
    
    public abstract void alimentarse();
    
}
