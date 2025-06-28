package archivos.Resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;        
import java.io.BufferedReader;        
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        File pergamino = new File("src/archivos/Resources/Pergamino.txt"); // EL NOMBRE SALE DE LA DOCUMENTACION DEL CAMPUS

        // FILE 
        try {
            pergamino.createNewFile();
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        // FILE READER 
        // CON LECTOR.READ() NUNCA SE HACE PQ ES INFEICIENTE
        // SE HACE CON BufferedReader
        try(BufferedReader bf = new BufferedReader(new FileReader(pergamino))) {
            String aux;

            while((aux = bf.readLine())!= null) {
                System.out.print(aux);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        } 
            
        System.out.println();
        System.out.println(pergamino.exists());
        System.out.println(pergamino.getAbsoluteFile());
        System.out.println(pergamino.getAbsolutePath());
    }
}