package wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Animal elefante = new Animal("Elefante");
        Animal leon = new Animal("Leon");
        Mascota gato = new Mascota("Gato", "Garfield");
        Perro perro = new Perro("Bolt", "San Bernardo");
        Persona persona = new Persona("Thiago", 19);
        
        List<Animal> animales = new ArrayList<>();
        List<Mascota> mascota = new ArrayList<>();
        
        Caja<Integer> cEntero = new Caja<>();
        Caja<String> cCadena = new Caja<>();
        Caja<Animal> cAnimal = new Caja<>();
        Caja<Mascota> cMascota = new Caja<>();
        Caja<Perro> cPerro = new Caja<>();
        Caja<Amigable> cAmigable = new Caja<>();
        
        cEntero.guardar(23);
        cCadena.guardar("Juan");
        cMascota.guardar(gato);
        cPerro.guardar(perro);
        cAmigable.guardar(persona);
        
        /*
        System.out.println(cEntero.obtener());
        System.out.println(cCadena.obtener());
        System.out.println(cMascota.obtener());
        System.out.println(cPerro.obtener());
        System.out.println(cAmigable.obtener());
        */
        
        // Otra forma de hacer lo de arriba, pero pudiendo pasar cajas de cualquier cosa
        // En GestionCajas esta el codigo
        GestionCajas.boxingMascotas(cAnimal, gato);
        GestionCajas.unBoxing(cEntero);
        GestionCajas.unBoxing(cCadena);
        GestionCajas.unBoxing(cMascota);
        GestionCajas.unBoxing(cAmigable);
        GestionCajas.unBoxingMascota(cPerro);
        GestionCajas.unBoxingMascota(cMascota);
        GestionCajas.unBoxingAmigable(cPerro);
        GestionCajas.unBoxingAmigable(cMascota);
        
        System.out.println("--------------------------- GESTOR LISTAS ----------------------------------------");
        GestorListas.agregarAnimal(animales, elefante);
        GestorListas.agregarAnimal(animales, leon);
        GestorListas.agregarAnimal(animales, gato);
        GestorListas.agregarAnimal(animales, perro);
        GestorListas.mostarAnimales(animales);
    }
}
