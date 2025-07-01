package javaland;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        
        Mago mago = new Mago("Thiago", 8);
        Mago mago2 = null;
        
        String pathArchivos = "src/recursos/";
        String archivoBinario = "mago.bin";
        String pathBinario = pathArchivos + archivoBinario;
        
        File f = new File(pathBinario);
        
        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f))){
            
            salida.writeObject(mago);
            
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
        try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(f))){
            
            mago2 = (Mago) entrada.readObject();
            System.out.println(mago2);
            
        } catch(IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            
        } 
    }
    
}