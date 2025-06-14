package trabajointegradorinterfaces;

public class Main {
    public static void main(String[] args) {
        EmpresaLogistica e = new EmpresaLogistica();

        CamionDeReparto c = new CamionDeReparto("C123", "Camion 1");
        DronDeEntrega d = new DronDeEntrega("Dron A");
        PersonaMensajera pm = new PersonaMensajera();

        e.agregarTransportador(c);
        e.agregarTransportador(d);
        e.agregarTransportador(pm);

        e.iniciarEntrega("Centro de la ciudad");
    }
}
