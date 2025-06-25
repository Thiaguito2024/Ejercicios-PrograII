package Model;

import Enum.Genero;
import Exceptions.EspectaculoRepetidoException;
import Interfaces.Calificable;
import Interfaces.Transmitible;
import java.util.ArrayList;
import java.util.List;

public class GestorEspectaculos {
    
    private List<Espectaculos> listaEspectaculos;

    public GestorEspectaculos() {
        listaEspectaculos = new ArrayList<>();
    }
    
    public void agregarEspectaculo(Espectaculos espectaculo) {
        if (validarEspectaculo(espectaculo)){
            throw new EspectaculoRepetidoException();
        }
        listaEspectaculos.add(espectaculo);
    }
    
    private boolean validarEspectaculo(Espectaculos espectaculo){
        for (Espectaculos e : listaEspectaculos){
            if(e.getNombre().equals(espectaculo.getNombre()) && e.getFecha().equals(espectaculo.getFecha())) {
                return true;
            }
        }
        return false;
    }
    
    public void mostrarEspectaculos() {
        if(listaEspectaculos.isEmpty()) {
            System.out.println("No hay espectaculos para mostrar");
        } else {
            for(Espectaculos espectaculos : listaEspectaculos) {
                    System.out.println(espectaculos.toString());
                    System.out.print("\n");
            }
        }
    }
    
    public void transmitirEventos() {
        for (Espectaculos e : listaEspectaculos){
            if(e instanceof Transmitible) {
                ((Transmitible) e).transmitir();
            } else {
                if(!(e instanceof Transmitible)) {
                    System.out.println("El espectaculo " + e.getNombre() + " no se puede transmitir");
                }
            }
        }
    }
    
    public List<Conciertos> filtrarPorGenero(Genero g) {
        boolean algunoCoincide = false;

        List<Conciertos> espectaculosFiltradosPorGenero = new ArrayList<>();
        for (Espectaculos e : listaEspectaculos){
            if (e instanceof Conciertos){
                Conciertos c = (Conciertos) e;
                if(c.getGenero() == g){
                    espectaculosFiltradosPorGenero.add(c);
                    algunoCoincide = true;
                }
            }   
        }
        
        if (!algunoCoincide) {
            System.out.println("Ningun espectaculo coincide con: " + g.name().toLowerCase());
        }
        return espectaculosFiltradosPorGenero;
    }
    
    public void calificarEvento(String nombre, int puntaje) {

        for (Espectaculos e : listaEspectaculos) {
                if (e instanceof Calificable) {
                    ((Calificable) e).calificar(puntaje);
                    System.out.println("El espectaculo " + nombre + " recibio " + puntaje);
                } else {
                    System.out.println("El espectaculo " + nombre + " no puede ser calificado.");
                }
                return;
        }
    }
}