package almacenamientoparte3.lambdas;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// PARTE 2: ORDENAMIENTO
public interface Almacenable <T> extends Iterable<T>{
    
    void agregar(T item);
    
    T obtener(int indice);

    void eliminarPorIndice(int indice);
    
    boolean eliminar(T item);

    boolean contiene(T item);
    
    int tamaño();

    void mostrarContenido();
    
    void mostrarContenido(Comparator<? super T> comparador);
    
    Iterator<T> iterator(Comparator<? super T> comparator);
    
    List<T> filtrar(Predicate<? super T> criterio);
    
    void paraCadaElemento(Consumer<?  super  T>  accion);
    
    <R> List<R> transformar(Function<?  super  T,  ?  extends  R> transformacion);
}