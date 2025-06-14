package libro;

public class Libro {
    private final int NUMERODEPAGINAS = 100;
    private String titulo;
    private String autor;   
    private int paginaActual;
    
    public Libro(String titulo, String autor, int paginaActual){
        this.titulo = titulo;
        this.autor = autor;
        this.paginaActual = paginaActual;
    }
    
    private boolean puedeAvanzar(){
        if (paginaActual < NUMERODEPAGINAS){
            return true;
        } else {
            return false;
        }
    }

    private boolean puedeRetroceder(){
        if (paginaActual > 1){
            return true;
        } else {
            return false;
        }
    }
    
    public int avanzarPagina() {
        if (puedeAvanzar()) {
            return ++paginaActual;
        } else {
            return paginaActual;
        }
    }

    public int retrocederPagina() {
        if (puedeRetroceder()) {
            return --paginaActual;
        } else {
            return paginaActual;
        }
    }
    
    public boolean finalLibro(){
        if (paginaActual == NUMERODEPAGINAS) {
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + ", autor " + autor + 
                ", pagina actual " + paginaActual);
        
        if (finalLibro()) {
            System.out.println("Felicidades, terminaste el libro");
        }
    }
}  