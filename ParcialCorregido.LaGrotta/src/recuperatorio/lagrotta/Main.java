package recuperatorio.lagrotta;

import Enum.TemporadaFlorecimiento;
import Exceptions.*;
import Model.*;

public class Main {
    public static void main(String[] args) {
        
        JardinBotanico jardin = new JardinBotanico();
        
        // Escenario 1
        try {
            Arbol arbol1 = new Arbol("Roble", "Zona Sur", "Tropical", 5);
            //Arbol arbol2 = new Arbol("Roble", "Zona Norte", "Tropical", 2);
            jardin.agregarPlanta(arbol1);
            //jardin.agregarPlanta(arbol2);
        } catch (PlantaRepetidaException p){
            System.out.println("Planta repetida");
        }
        
        try {
            //Arbol arbol1 = new Arbol("Roble", "Zona Norte", "Tropical", 20);
            Arbol arbol2 = new Arbol("Roble", "Zona Norte", "Tropical", 2);
            //jardin.agregarPlanta(arbol1);
            jardin.agregarPlanta(arbol2);
        } catch (AlturaInvalidaException a) {
            System.out.println("Altura invalida");
        }
        
        Arbusto arbusto = new Arbusto("Arbusto1", "Zona Sur", "Arido", 6);
        Arbusto arbusto2 = new Arbusto("Arbusto2", "Zona Este", "Arido", 9.8);
                
        Flor flor = new Flor("Rosa", "Zona Oeste", "Calido", TemporadaFlorecimiento.PRIMAVERA);
        Flor flor1 = new Flor("Jazmin", "Zona Sur", "Calido", TemporadaFlorecimiento.PRIMAVERA);
        
        jardin.agregarPlanta(arbusto);
        jardin.agregarPlanta(arbusto2);
        jardin.agregarPlanta(flor);
        jardin.agregarPlanta(flor1);
  
        // Escenario 2
        System.out.print("\n");
        System.out.println("------------- MOSTRANDO PLANTAS ------------------------");
        jardin.mostrarPlantas();
        
        // Escenario 3
        System.out.print("\n");
        System.out.println("------------- PODANDO PLANTAS ------------------------");
        jardin.podarPlantas();
        
        // Escenario 4
        System.out.print("\n");
        System.out.println("------------- FILTRANDO POR TEMPORADA DE FLORECIMIENTO ------------------------");
        jardin.filtrarPorTemporadaFlorecimiento(TemporadaFlorecimiento.VERANO);
    }
}
