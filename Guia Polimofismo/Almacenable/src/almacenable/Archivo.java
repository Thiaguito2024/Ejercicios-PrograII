package almacenable;

public class Archivo implements Almacenable{
     
    @Override
    public void guardar(){
        System.out.println("Guardando archivo");
    }
}
