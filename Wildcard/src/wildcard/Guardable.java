package wildcard;

public interface Guardable <T>{
    
    void guardar(T valor);
    T obtener();
}
