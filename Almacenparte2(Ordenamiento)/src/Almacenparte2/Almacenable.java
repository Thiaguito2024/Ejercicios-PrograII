package Almacenparte2;

import java.util.Comparator;
import java.util.Iterator;

// PARTE 2: ORDENAMIENTO
public interface Almacenable <T> extends Iterable<T>{
    
    void agregar(T item);
    
    T obtener(int indice);

    void eliminarPorIndice(int indice);
    
    boolean eliminar(T item);

    boolean contiene(T item);
    
    int tamaño();
    
    /*
    static <T> void mostrarContenido(Almacenable <? extends T> almacenable){
        for(T item : almacenable) {
            System.out.println(item);
        }
    } */

    void mostrarContenido();
    
    void mostrarContenido(Comparator<? super T> comparador);
    
    Iterator<T> iterator(Comparator<? super T> comparator);
}