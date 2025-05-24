package dispositivoelectronico;

public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono("Samsung", "Galaxy S10");
        Tablet tablet = new Tablet("Apple", "iPad Air");

        telefono.mostrarInformacion();
        telefono.hacerLlamada("123-456-789");
        
        System.out.println("--------------");

        tablet.mostrarInformacion();
        tablet.verVideo("Documental: El Universo");
    }
}
