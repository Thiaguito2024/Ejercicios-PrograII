package auto;

public class Prueba {

    public static void main(String[] args) {
        Auto a1 = new Auto("AAA122", "Ford", 2018);        
        Auto a2 = new Auto("ABC123", "Fiat", 2017);
        Auto a3 = new Auto("CCC177", "Toyota", 2020);
        Auto a4 = new Auto("DDD200", "Citroen", 2025);
        
        Moto m1 = new Moto("CGB222", "Honda", 2020);
        Moto m2 = new Moto("ADF234", "BMW", 2016);
        Moto m3 = new Moto("HJU622", "Yamaha", 2000);
        Moto m4 = new Moto("AQW567", "Kawasaki", 2005);
        
        Estacionamiento e = new Estacionamiento("Parking vip");
       
        e.agregaVehiculo(a1);
        e.agregaVehiculo(a2);
        e.agregaVehiculo(a3);
        e.agregaVehiculo(a4);

        e.agregaVehiculo(m1);
        e.agregaVehiculo(m2);
        e.agregaVehiculo(m3);
        e.agregaVehiculo(m4);

       e.listarVehiculos();
    }
}
