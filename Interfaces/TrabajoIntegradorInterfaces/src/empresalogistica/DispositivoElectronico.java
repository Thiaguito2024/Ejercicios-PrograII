package empresalogistica;

public class DispositivoElectronico {
    
    private String dispositivo;
    
    public DispositivoElectronico(String dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    public void encendido(){
        System.out.println("El dispositivo esta encendido");
    }
    
   public String getDispositivo(){
        return dispositivo;
    }
}
