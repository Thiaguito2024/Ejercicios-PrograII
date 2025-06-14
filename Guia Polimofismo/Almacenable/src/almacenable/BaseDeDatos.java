package almacenable;

public class BaseDeDatos implements Almacenable{
    
    @Override 
    public void guardar(){
        System.out.println("Guardando en la Base de Datos");
    }
}
