package integrador.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Organizador {
    
    public static List<Tarea> filtarTareas(List<Tarea> tareas, FiltroTarea filtro){
        List<Tarea> toReturn = new ArrayList<>();
        for(Tarea tarea : tareas){
            if(filtro.test(tarea)){
                toReturn.add(tarea);
            }
        }
        return toReturn;
    }

    public static void ordenarTareas(List<Tarea> tareas, Comparator<Tarea> criterio) {
        tareas.sort(criterio);
    }

    public static void aplicarAccion(List<Tarea> tareas, AccionTarea accion) {
        for(Tarea tarea: tareas){
            accion.ejecutar(tarea);
        }
    }
}