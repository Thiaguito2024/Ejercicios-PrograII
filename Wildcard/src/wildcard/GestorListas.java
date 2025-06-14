package wildcard;

import java.util.List;

public interface GestorListas {

    public static void agregarAnimal(List<? super Animal> lista, Animal animal){
        lista.add(animal);
    }
    
    public static void mostarAnimales(List<? extends Animal> lista){
        for(Animal a : lista){
            System.out.println(a);
        }
    }
}
