package Model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaAeroespacial {
    
    private String nombre;
    private List<Cohete> cohetes;
    
    public EmpresaAeroespacial(String nombre){
        this.nombre = nombre;
        this.cohetes = new ArrayList<>();
    }
    
    public int cantListosParaLanzar(){
        int contListos = 0;

        for (Cohete c : cohetes) {
            if (c.aprobado()){
                contListos++;
            }
        }
        return contListos;
    }
    
    public void agregarCohete(Cohete c){
        if (c != null){ 
            cohetes.add(c);
        }
    }
}
