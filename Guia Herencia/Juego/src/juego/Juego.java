package juego;

class Juego {
    
    private String nombre;

    public Juego(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void iniciarJuego() {
        System.out.println("Iniciando el juego: " + nombre);
    }
}