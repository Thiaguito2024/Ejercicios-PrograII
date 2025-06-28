package ordenamiento3;

public class Libro {
    
    private String titulo;
    
    public Libro(String titulo){
        this.titulo = titulo;
    }
 
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + '}';
    }    
}