package sistemadevehículosautónomos;

public class Main {
    public static void main(String[] args) {
        
        CamionAutonomo Camion = new CamionAutonomo(123);
        CocheAutonomo Coche = new CocheAutonomo("Focus");
        
        SimuladorRuta sr1 = new SimuladorRuta(Camion);
        SimuladorRuta sr2 = new SimuladorRuta(Coche);
        
        sr1.recorrerRuta(Camion);
        System.out.println("---------------------");
        sr2.recorrerRuta(Coche);
    }
    
    public static class SimuladorRuta {
        
        private Conducible vehiculo;
        
        public SimuladorRuta(Conducible vehiculo) {
            this.vehiculo = vehiculo;
        }
        
        public void recorrerRuta(Conducible vehiculo) {
        vehiculo.acelerar();
        vehiculo.girar();
        vehiculo.frenar();
        }
    }
}
