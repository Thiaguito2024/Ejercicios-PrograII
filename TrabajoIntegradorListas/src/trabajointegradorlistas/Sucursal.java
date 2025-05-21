package trabajointegradorlistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Sucursal {
    
    private String nombre; 
    private ArrayList<DispositivosElectronicos> dispositivosElectronicos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.dispositivosElectronicos = new ArrayList<>();
    }
    
    public boolean tieneNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Sucursal s)) {
            return false;
        }
        return this.nombre.equals(s.nombre);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre);
    }
    public void agregarDispositivo(DispositivosElectronicos d) {
        dispositivosElectronicos.add(d);
    }
    
    public void listarDispositivos(){
        for(int i = 0; i < dispositivosElectronicos.size(); i++) {
            System.out.println(dispositivosElectronicos.get(i));
        }
    }
    
    public ArrayList<DispositivosElectronicos> dispositivosPorTipo(TipoDispositivo tipoBuscado){
        ArrayList<DispositivosElectronicos> listaFiltrada = new ArrayList<>();
        
        for (DispositivosElectronicos d : dispositivosElectronicos) {
            if (d.getTipo() == tipoBuscado) {
                listaFiltrada.add(d);
            }
        }
        return listaFiltrada;
    }
    
    public void borrarDispositivo(String id) {
        Iterator<DispositivosElectronicos> it = dispositivosElectronicos.iterator();
        while(it.hasNext()){
            if(it.next().tieneId(id)){
                it.remove();
            }
        }               
    }
    
   public double[] porcDispotivoPorTipo(){
       int cantTipo = TipoDispositivo.values().length;
       int total = dispositivosElectronicos.size();
       int[] cantidades = new int[cantTipo];
       double[] porcentajes = new double [cantTipo];
    
       for (DispositivosElectronicos d: dispositivosElectronicos){
           cantidades[d.getTipo().ordinal()]++;
       }
       
       for (int i = 0; i < cantTipo; i++) {
           porcentajes[i] = (double) cantidades[i] * 100 / total;
       }
       
       return porcentajes; 
   }
   
}