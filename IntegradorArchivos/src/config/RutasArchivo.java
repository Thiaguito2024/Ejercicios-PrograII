package config;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface RutasArchivo {
    
    static final String BASE = "src/resources";
    static final String FILE_CSV = "personas.csv";
    static final String FILE_BIN = "personas.bin";
    
    public static Path getRutaCSV(){
        return Paths.get(BASE, "Personas.csv");
    }
    
    public static Path getRutaBinario(){
        return Paths.get(BASE, "Personas.bin");
    }
    
    public static String getRutaCSVString(){
        return getRutaCSV().toString();
    }
    
    public static String getRutaBinarioString(){
        return getRutaBinario().toString();
    }   
}
