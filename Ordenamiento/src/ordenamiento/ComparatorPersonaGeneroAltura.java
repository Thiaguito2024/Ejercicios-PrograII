package ordenamiento;

import java.util.Comparator;

public class ComparatorPersonaGeneroAltura implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        int cmp = Character.compare(p1.getGenero(), p2.getGenero()); 
    
        // SI QUISIERA ORDENAR PRIMERO POR ALTURA CRECIENTE Y DSP POR GENERO: 
        // int cmp = Character.compare(p2.getGenero(), p1.getGenero()); 
        
        // SI CMP(COMPARATOR) ES 0 SIGNIFICA QUE ESTOY COMPARANDO DOS PERSONAS DEL MISMO GENERO
        if(cmp == 0){
            return Double.compare(p1.getAltura(), p2.getAltura());  
        }
        
        return cmp;
    }
}