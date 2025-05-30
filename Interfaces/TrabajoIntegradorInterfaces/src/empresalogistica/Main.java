package empresalogistica;

public class Main {
    public static void main(String[] args) {
        
        TransportadorDePaquetes cdr = new CamionDeReparto("123", "thiago"); // CamionDeReparto
        TransportadorDePaquetes dde = new DronDeEntrega("DronUltimaGeneracion"); // DronDeEntrega
        TransportadorDePaquetes pm = new PersonaMensajera(); // PersonaMensajera

        EmpresaDeLogistica e = new EmpresaDeLogistica();
        
        e.agregarTransportador(pm);
        e.agregarTransportador(dde);
        e.agregarTransportador(cdr);
        
        e.iniciarEntregar("Capital");
    }
}