package sistemadevehículosautónomos;

public class CocheAutonomo implements Conducible{
    
    private String modelo;

    public CocheAutonomo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Auto: " + modelo + " aclerando");
    }

    @Override
    public void frenar(){
        System.out.println("Auto: " + modelo + " frenando");
    }

    @Override
    public void girar(){
        System.out.println("Auto: " + modelo + " girando");
    }
}
