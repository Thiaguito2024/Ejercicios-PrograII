package wildcard;

public class Animal {
    
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
    
    public void alimentar() {
        System.out.println("Alimentando");
    }
    
    public String getEspecie(){
        return especie;
    }

    @Override
    public String toString() {
        return "Animal: " + "\nespecie: " + especie;
    }
    
    
}
