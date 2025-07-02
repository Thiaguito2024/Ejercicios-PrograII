package integrador.lambdas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Tarea> tareas = new ArrayList<>();
        
        tareas.add(new Tarea("Estudiar para el parcial de matematicas", false, LocalDate.of(2025, 7, 5), 120, 1));
        tareas.add(new Tarea("Hacer las compras", true, LocalDate.of(2025, 6, 28), 45, 2));
        tareas.add(new Tarea("Llamar al medico", false, LocalDate.of(2025, 7, 1), 10, 2));
        tareas.add(new Tarea("Entregar trabajo practico integrador lambdas de programacion", false, LocalDate.of(2025, 7, 3), 180, 1));
        tareas.add(new Tarea("Limpiar el escritorio", true, LocalDate.of(2025, 6, 29), 30, 3));
        tareas.add(new Tarea("Revisar correos", false, LocalDate.of(2025, 6, 30), 20, 3));
        tareas.add(new Tarea("Preparar presentacion", false, LocalDate.of(2025, 7, 2), 90, 2));
        tareas.add(new Tarea("Actualizar CV", false, LocalDate.of(2025, 7, 10), 60, 3));
        
        //----------------------------------------------------------------
        List<Tarea> completadas = Organizador.filtarTareas(tareas,t -> t.isCompletada());
        // Otra forma es hacerlo asi: 
        List<Tarea> completadas2 = Organizador.filtarTareas(tareas,Tarea::isCompletada);
        /*List<Tarea> completadas = Organizador.filtarTareas(tareas, new FiltroTarea() {
            @Override
            public boolean test(Tarea tarea) {
                return tarea.isCompletada();
            }
        });*/
        
        //----------------------------------------------------------------
        System.out.println("Tareas completadas: "); // Printeo la completadas original
        completadas.forEach(System.out::println);
        System.out.println("---------------------------");
        
        //----------------------------------------------------------------
        Organizador.ordenarTareas(tareas, (t1, t2) -> t1.getFechavencimiento().compareTo(t2.getFechavencimiento()));
        // SE PUEDE HACER ASI O HACIENDO UN NEW COMPARATOR
        System.out.println("Tareas por prioridad: ");
        tareas.forEach(System.out::println);
        System.out.println("---------------------------");
        
        //----------------------------------------------------------------
        List<Tarea> pendientes = Organizador.filtarTareas(tareas, t -> !t.isCompletada());
        
        List<Tarea> vencenHoy = Organizador.filtarTareas(pendientes, t -> t.getFechavencimiento().equals(LocalDate.now()));
        
        Organizador.aplicarAccion(vencenHoy, t -> System.out.println("Recorda: " + t.getNombre() + ", vence hoy"));
       
    }
}
