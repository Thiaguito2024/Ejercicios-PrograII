package mensajes;

public class Mail extends Mensaje{
    
    @Override
    public void enviar() {
        System.out.println("Enviando mail");
    }
}
