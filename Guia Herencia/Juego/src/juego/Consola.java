package juego;

class Consola extends Juego {

    public Consola(String nombre) {
        super(nombre);
    }

    public void cargarCartucho() {
        System.out.println("Cartucho cargado: " + super.getNombre());
    }
}