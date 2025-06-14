package animal;

public abstract class Leon extends Animal{

    public Leon(String especie, int edad) {
        super(especie, edad);
    }
    
    @Override
    public void alimentarse() {
        System.out.println("Leon cazando");
    }
}
