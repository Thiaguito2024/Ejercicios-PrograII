package recuperatorio.lagrotta;

import Enum.Clasificacion;
import Enum.Genero;
import Exceptions.EspectaculoRepetidoException;
import Model.Conciertos;
import Model.Festivales;
import Model.GestorEspectaculos;
import Model.ObrasTeatrales;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        
        GestorEspectaculos gestorEspectaculos = new GestorEspectaculos();
        List<String> artistas = new ArrayList<>();
        artistas.add("artista 1");
        artistas.add("artista 2");
        artistas.add("artista 3");
        
        try {
            Conciertos concierto1 = new Conciertos("concierto1", LocalDate.now(), 120, Genero.ROCK, artistas);
            //Concierto concierto2 = new Conciertos("Rock Fest", LocalDate.of(2025, 7, 10), 120, Genero.ROCK, artistas);
            gestorEspectaculos.agregarEspectaculo(concierto1);
            //gestorEspectaculos.agregarEspectaculo(concierto2);

        } catch (EspectaculoRepetidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        Conciertos concierto2 = new Conciertos("concierto2", LocalDate.now(), 90, Genero.JAZZ, artistas);
        
        ObrasTeatrales obra1 = new ObrasTeatrales("obra1", LocalDate.now(), 90, Clasificacion.MAYOR13, "Director1");
        ObrasTeatrales obra2 = new ObrasTeatrales("Obra 2", LocalDate.now(), 90, Clasificacion.ATP, "María González");
       
        Festivales festival1 = new Festivales("Festival1", LocalDate.now(), 300, 4, true);
        Festivales festival2 = new Festivales("Festival2", LocalDate.now(), 150, 2, false);
        
        gestorEspectaculos.agregarEspectaculo(concierto2);
        gestorEspectaculos.agregarEspectaculo(obra1);
        gestorEspectaculos.agregarEspectaculo(obra2);
        gestorEspectaculos.agregarEspectaculo(festival1);
        gestorEspectaculos.agregarEspectaculo(festival2);
               
        System.out.println("--------------------- MOSTRANDO ESPECTACULOS ---------------------");
        gestorEspectaculos.mostrarEspectaculos();
        
        System.out.println("--------------------- TRANSMITIENDO ---------------------");
        gestorEspectaculos.transmitirEventos();
        
        System.out.println("--------------------- CALIFICANDO ---------------------");
        gestorEspectaculos.calificarEvento("Concierto2", 5);
        
        System.out.println("--------------------- FILTRANDO POR GENERO ---------------------");
        List<Conciertos> conciertos = gestorEspectaculos.filtrarPorGenero(Genero.POP);
        
        for (Conciertos c : conciertos) {
            System.out.println(c);
        }
    }
}
