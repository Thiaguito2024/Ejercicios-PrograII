package mensajes;

public class SMS extends Mensaje{
    
    @Override
    public void enviar(){
        System.out.println("Enviando SMS");
    }
}
