package biblioteca;

import java.util.ArrayList;


class Biblioteca {
    
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println("Libro: " + libro.getTitulo());
        }
    }

}

