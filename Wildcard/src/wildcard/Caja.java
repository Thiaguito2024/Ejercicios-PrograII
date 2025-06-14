package wildcard;

public class Caja<T>  implements Guardable<T>{
    
    private T dato;
    
    @Override
    public void guardar(T valor) {
        dato = valor;
    }
    
    @Override
    public T obtener() {
        return dato;
    }
    
}
