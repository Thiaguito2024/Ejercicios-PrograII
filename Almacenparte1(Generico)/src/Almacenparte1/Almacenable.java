package Almacenparte1;

public interface Almacenable <T> extends Iterable<T>{
    
    void agregar(T item);
    
    T obtener(int indice);

    void eliminarPorIndice(int indice);
    
    boolean eliminar(T item);

    boolean contiene(T item);
    
    int tamaño();
    
    static <T> void mostrarContenido(Almacenable <? extends T> almacenable){
        for(T item : almacenable) {
            System.out.println(item);
        }
    } 
}