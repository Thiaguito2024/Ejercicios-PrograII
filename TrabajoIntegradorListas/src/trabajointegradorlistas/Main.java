package trabajointegradorlistas;


public class Main {

    public static void main(String[] args) {
        
        cadenaTiendas c1 = new cadenaTiendas();
        cargarTienda(c1);
        
        c1.listarDispositivos();
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("Porcentaje de cada dispositivo");
        
        double[] porcentajes = c1.porcDispotivoPorTipo("Sucursal A");
        for (int i = 0; i < porcentajes.length; i++){
            System.out.println(String.format("%s. %.2f", TipoDispositivo.values()[i].name(), porcentajes[i]));
        }
    }
    
public static void cargarTienda(cadenaTiendas c) {
    Sucursal s1 = new Sucursal("Sucursal A");
    s1.agregarDispositivo(new DispositivosElectronicos("a1", 100, TipoDispositivo.COMPUTADORA));
    s1.agregarDispositivo(new DispositivosElectronicos("a2", 120, TipoDispositivo.COMPUTADORA));
    s1.agregarDispositivo(new DispositivosElectronicos("a3", 70, TipoDispositivo.TABLET));

    Sucursal s2 = new Sucursal("Sucursal B");
    s2.agregarDispositivo(new DispositivosElectronicos("b1", 101, TipoDispositivo.COMPUTADORA));
    s2.agregarDispositivo(new DispositivosElectronicos("b2", 115, TipoDispositivo.TELEFONO));
    s2.agregarDispositivo(new DispositivosElectronicos("b3", 87, TipoDispositivo.TELEFONO));
    s2.agregarDispositivo(new DispositivosElectronicos("b4", 98, TipoDispositivo.TABLET));
    s2.agregarDispositivo(new DispositivosElectronicos("b5", 98, TipoDispositivo.TABLET));

    c.agregarSucursal(s1);
    c.agregarSucursal(s2);
}
}