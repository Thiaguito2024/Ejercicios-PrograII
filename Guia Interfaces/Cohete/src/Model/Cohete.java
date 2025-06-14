package Model;

import Interfaces.Aprobable;
import java.util.ArrayList;
import java.util.List;

public class Cohete implements Aprobable{
    
    private static final int INITIAL_ID = 50000;
    private static int nextId = INITIAL_ID;
    private int id;
    private String nombre;
    private List<Prueba> pruebasRealizadas;
    
    public Cohete(String nombre){
        id = asignarId();
        this.nombre = nombre;
        this.pruebasRealizadas = new ArrayList<>();
    }
    
    private static int asignarId() {
        return nextId++;
    }

    @Override
    public boolean aprobado() {
        if(pruebasRealizadas.isEmpty()){
            return false;
        }
        for (Prueba p : pruebasRealizadas) {
            if (!p.aprobado()) {
                return false;
            }
        }
        return true;
    }
    
    public void agregarPrueba(Prueba p){
        if (p != null){ 
            pruebasRealizadas.add(p);
        }
    }
}
