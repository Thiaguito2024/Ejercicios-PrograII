package Almacenparte2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

// ALMACEN PARTE 2: AGREGANDO ORDENAMIENTO AL ALMACEN 
public class Almacen<T> implements Almacenable<T>{

    private List<T> items = new ArrayList<>();
    
    @Override
    public void agregar(T item) {
        validarItemRepetido(item);
        items.add(item);
    }

    private void validarItemRepetido(T item){
        if (contiene(item)) {
            throw new IllegalArgumentException("item repetido");
        }
    }
    
    private void validarIndice(int indice){
        if(indice < 0 || indice >= tamaño()) {
            throw new IndexOutOfBoundsException("Indice invalido");
        }
    }
    
    @Override
    public T obtener(int indice) {
        validarIndice(indice);
        return items.get(indice);
    }

    @Override
    public void eliminarPorIndice(int indice) {
        validarIndice(indice);
        items.remove(indice);
    }

    @Override
    public boolean eliminar(T item) {
        return items.remove(item);
    }

    @Override
    public boolean contiene(T item) {
        return items.contains(item);
    }

    @Override
    public int tamaño() {
        return items.size();
    }

    @Override
    public Iterator iterator() {
                                // Se puede usar items.get(0) u obtener
        if(!(items.isEmpty()) && obtener(0) instanceof Comparable){ // pregunto si lo elementos de la lista son comparables
            return iterator((Comparator<? super T>) Comparator.naturalOrder()); // Tengo q castear lo q le paso por aca para q lo pueda ordenar
        }
        return items.iterator();
    }
    
    public Iterator<T> iterator(Comparator<? super T> comparador) {
        List<T> copiaItems = new ArrayList<>(items);
        //Collections.sort(copiaItems); Este o el de abajo hacen exactamente lo mismo
        copiaItems.sort(comparador);
        return copiaItems.iterator();
    }

    @Override
    public void mostrarContenido() {
        for(T item: this) {
            System.out.println(item);
        }
    }

    @Override
    public void mostrarContenido(Comparator<? super T> comparador) {
        Iterator<T> it = iterator(comparador);
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}