package repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Empleado;
import model.Sector;

public interface PersistenciaEmpleados {

    static void guardarEmpleadosCSV(List<? extends Empleado> lista, String path){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(Empleado.toCSVHeader() + "\n");
            for(Empleado e : lista){
                bw.write(e.toCSV() + "\n");
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    static List<Empleado> cargarEmpleadosCSV(String path) {
        List<Empleado> empleados = null;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            empleados = new ArrayList<>();
            String linea;
            br.readLine(); 

            while ((linea = br.readLine()) != null) {
                empleados.add(Empleado.fromCSV(linea));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return empleados;
    }
    
    static void serializarEmpleados(List<? extends Empleado> lista, String path) {
        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(path))){
            salida.writeObject(lista);
            
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    static List<Empleado> deserializarEmpleados(String path) {
        List<Empleado> empleados = null;
        
        try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(path))){
            return (List<Empleado>) entrada.readObject();
            
        } catch(IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return empleados;
    }
    
}
