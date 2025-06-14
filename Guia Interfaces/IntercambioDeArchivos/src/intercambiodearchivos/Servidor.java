package intercambiodearchivos;

public class Servidor {
    
    private Transferencia t;
    
    public Servidor(Transferencia t) {
        this.t = t;
    }
    
    public void subir(){
        t.subir();
    }
    
    public void bajar(){
        t.bajar();
    }
}