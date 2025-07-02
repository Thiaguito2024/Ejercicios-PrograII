package integrador.lambdas;

@FunctionalInterface
public interface FiltroTarea {
    
    boolean test(Tarea tarea);
}
