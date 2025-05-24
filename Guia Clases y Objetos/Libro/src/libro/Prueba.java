package libro;

public class Prueba {
    public static void main(String[] args){
        Libro l1;
        
        l1 = new Libro("Fuego Secreto", "C. J. Daugherty, Carina Rozenfeld", 99);
        
        System.out.println("\n");
        l1.mostrarInfo();
        
        System.out.println("\n");
        l1.avanzarPagina();
        l1.mostrarInfo();
        
        System.out.println("\n");
        l1.retrocederPagina();
        l1.mostrarInfo();
        
    }
}
