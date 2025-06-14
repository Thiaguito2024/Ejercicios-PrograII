package auto;
import java.util.ArrayList;

public class Estacionamiento {
    
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    
    public Estacionamiento(String nombre){
        this.nombre = nombre; 
        vehiculos = new ArrayList<>();
    }
    
    // Obtengo el auto por su patente 
    public Auto sacarAutos(){
        return null;
    }
    
    // Agrega un auto a la lista
    public void agregaVehiculo(Vehiculo v){
        checkNull(v);
        vehiculos.add(v);
    }
    
    public void checkNull(Vehiculo v){
        if (v == null){
            throw new NullPointerException("Objeto Nulo");
        }
    }
    
    public void listarVehiculos(){
        if(vehiculos.isEmpty()){
            System.out.println("No hay vehiculos para mostrar");
        } else {
            System.out.println("Lista de vehiculos");
            for (Vehiculo v : vehiculos) {
                System.out.println(v);
            }
        }
    }
    
    private int buscarVehiculoPatente(String patente){
        int indice = -1;
        int i = 0;
        while(i < vehiculos.size() && indice == -1){
            if (vehiculos.get(i).getPatente().equals(patente)){
                i = indice;
            }
            i++;
        }
        return i;
    }   

    // Retorna true si esta en el estacionamiento un auto
    // con la patente recibida por  parametros
    public boolean estaVehiculo(String patente){
        return buscarVehiculoPatente(patente) != -1;
    }

    // Obtengo un auto del estacionamiento por su patente
    public Object sacarObjeto(String patente){
        int indice = buscarVehiculoPatente(patente);
        if (indice == -1) {
            return null;
        } 
        return vehiculos.remove(indice);
    } 
    
    // Obtener lista de autos
    public ArrayList<Object> getVehiculos(){
        return new ArrayList<>(vehiculos);
    }
    
    public int cantidadObjetos(){
        return vehiculos.size();
    }
     
}

