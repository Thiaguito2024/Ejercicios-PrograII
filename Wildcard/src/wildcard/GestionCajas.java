package wildcard;

public interface GestionCajas {
    
    // Este es un wildcard normal
    public static void unBoxing(Caja<?> caja){
        System.out.println(caja.obtener());
    } 
    
    // Este tipo de wildcard se llama: lower bound wildcard = comodin de limite inferior
    public static <T> void boxingGenerico(Caja<? super T> caja, T elemento) {
        caja.guardar(elemento);
    }
    
    // Este tipo de wildcard se llama: upper bound wildcard = comodin de limite superior
    public static void unBoxingMascota(Caja<? extends Mascota> caja){ // Aca si se pasa el tipo de dato especifico
        caja.obtener().vacunar();                                    // Porque el nombre del metodo lo indica  asi
    } 
    
    // Lo mismo que arriba(boxing(Caja<? super Object> caja, Object elemento)) pero acotando la genericidad
    public static void boxingMascotas(Caja<? super Mascota> caja, Mascota mascota) {
        caja.guardar(mascota);
    }

    // Esto es lo mismo que el de arriba(unBoxingMascota(Caja<? extends Mascota> caja)) pero con interfaces
    public static void unBoxingAmigable(Caja<? extends Amigable> caja){ // Por mas que sea una interface va extends
        caja.obtener().darCariño();                
    } 
    
    // Esto es lo mismo que el de arriba(boxingMascotas(Caja<? super Mascota> caja, Mascota mascota)) pero con interfaces
    public static void BoxingAmigable(Caja<? super Amigable> caja, Amigable amigo){ // Por mas que sea una interface va extends
        caja.guardar(amigo);                
    }
}
