package sistemadevehículosautónomos;

public class CamionAutonomo implements Conducible{
    
    private int id;
    
    public CamionAutonomo(int id) {
        this.id = id;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Camion: " + id + " aclerando");
    }

    @Override
    public void frenar(){
        System.out.println("Camion: " + id + " frenando");
    }

    @Override
    public void girar(){
        System.out.println("Camion: " + id + " girando");
    }
}
