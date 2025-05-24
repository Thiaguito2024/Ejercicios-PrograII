package vehiculotpherencia;

public class Main {

    public static void main(String[] args) {
        
        Coche c = new Coche(210000, "Volkswagen", 2024);
        
        String especsCoche = c.mostrarDetalles();
        System.out.println(especsCoche);
        
        System.out.println("--------------------------------");
        Moto m = new Moto(true, "Yamaha", 2020);
        
        String especsMoto = m.mostrarDetalles();
        System.out.println(especsMoto);
    }
    
}
