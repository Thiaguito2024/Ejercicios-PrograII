package biblioteca;

public class Main{
    public static void main(String[] args) {
        BibliotecaPublica biblioteca = new BibliotecaPublica();

        biblioteca.agregarLibro(new Libro("La Ciudad Secreta"));
        biblioteca.agregarLibro(new Libro("El Principito"));
        biblioteca.agregarLibro(new Libro("1984"));

        biblioteca.accesoPublico();
        biblioteca.mostrarLibros();
    }
}


