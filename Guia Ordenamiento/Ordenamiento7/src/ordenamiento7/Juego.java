package ordenamiento7;

public class Juego implements Comparable<Juego> {  

    private String titulo;
    private int duracion;
    private String genero;

    public Juego(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compareTo(Juego p) {
        return Integer.compare(duracion, p.getDuracion());
    }

    @Override
    public String toString() {
        return "Juego{" + "titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
}