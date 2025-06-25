package Model;

import Enum.TemporadaFlorecimiento;
import Exceptions.PlantaRepetidaException;
import Interfaces.DesprenderAroma;
import Interfaces.Podable;
import java.util.ArrayList;
import java.util.List;

public class JardinBotanico {
    
    private List<Planta> listaPlantas;
    
    public JardinBotanico(){
        this.listaPlantas = new ArrayList<>();
    }
    
    public void agregarPlanta(Planta planta){
        if (validarPlantaRepetida(planta)){
            throw new PlantaRepetidaException();
        }
        listaPlantas.add(planta);
    }
    
    private boolean validarPlantaRepetida(Planta planta){
        for (Planta plantaExistente : listaPlantas){
            if(plantaExistente.getNombre().equals(planta.getNombre()) 
                    && plantaExistente.getUbicacion().equals(planta.getUbicacion())) {
                return true;
            }
        }
        return false;
    }
    
    public void mostrarPlantas() {
        if (listaPlantas.isEmpty()){
            System.out.println("No hay plantas para mostrar en el jardin!");
        } else {
            for(Planta planta : listaPlantas) {
                System.out.println(planta.toString());
                System.out.print("\n");
            }
        }
    }
    
    public void podarPlantas() {
        for (Planta planta : listaPlantas){
            if(planta instanceof Podable){
                ((Podable) planta).podar();
            } else {
                if(!(planta instanceof Podable)){
                    System.out.println("La planta " + planta.getNombre() + " no se puede podar");
                }
            }
        }
    }
    
    public void desprenderAroma(Planta planta) {
        if(planta instanceof DesprenderAroma){
            ((DesprenderAroma) planta).desprenderAroma();
        } else {
            if(!(planta instanceof DesprenderAroma)) {
                System.out.println("Esta planta no desprende aroma");
            }
        }
    }
    
    public void filtrarPorTemporadaFlorecimiento(TemporadaFlorecimiento temporada) {
        boolean algunaCoincide = false;

        for (Planta planta : listaPlantas) {
            if (planta instanceof Flor) {
                Flor flor = (Flor) planta;
                if (flor.getTempFlorecimiento() == temporada) {
                    System.out.println("La flor " + flor.getNombre() + " florece en la temporada " + flor.getTempFlorecimiento());
                    algunaCoincide = true;
                }
            }
        }

        if (!algunaCoincide) {
            System.out.println("Ninguna flor florece en la temporada: " + temporada.name().toLowerCase());
        }
    }
}
