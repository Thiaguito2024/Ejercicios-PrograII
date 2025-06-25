package Almacenparte1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

// ALMACEN PARTE 1 ALMACEN GENERICO
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
        return items.iterator();
    }
}