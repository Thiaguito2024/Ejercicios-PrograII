package trabajointegradorlistas;

import java.util.ArrayList;

public class cadenaTiendas {
    
    private ArrayList<Sucursal> sucursales;
    
    public cadenaTiendas() {
        this.sucursales = new ArrayList<>();
    }
    
    private void validarSucursal(Sucursal s) {
        if (s == null) {
            throw new NullPointerException("Sucursal nula");
        }
        if (sucursales.contains(s)) {
            throw new IllegalArgumentException("Sucursal repetida");
        }
    }
    
    public void agregarSucursal(Sucursal s) {
        validarSucursal(s);
        sucursales.add(s);
    }
    
    public void listarDispositivos(){
        for (Sucursal s : sucursales) {
            s.listarDispositivos();
        }
    }
    
    public void borrarDispositivo(String idAlfanumerico) {
        for (Sucursal s : sucursales) {
            s.borrarDispositivo(idAlfanumerico);
        }
    }
    
    public double[] porcDispotivoPorTipo(String nombreSucursal){
        double[] porcentajes = null;
        
        for (Sucursal s : sucursales) {
            if(s.tieneNombre(nombreSucursal)) {
                return s.porcDispotivoPorTipo();
            }
        }
       return porcentajes; 
   }
}