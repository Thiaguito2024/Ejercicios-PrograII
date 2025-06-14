package sistemadegestiondehotel;

import java.util.ArrayList;

public abstract class Persona {
    
    String nombre;
    String dni;
    ArrayList<String> notificaciones;

    public Persona() {
        notificaciones = new ArrayList<>();
    }
    public Persona(String nombre, String dni) {
        this();
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public abstract void notificar(String notificacion);

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public ArrayList<String> getNotificaciones() {
        return notificaciones;
    }
    
    protected void agregarNotificacion(String mensaje){
        notificaciones.add(mensaje);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", notificaciones=" + notificaciones + '}';
    }

    public void mostrarNotificaciones(){
        for (String noti : notificaciones){
            System.out.println(noti);
        }
    }
    
    
    
}
