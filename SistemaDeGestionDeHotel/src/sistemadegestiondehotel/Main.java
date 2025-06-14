package sistemadegestiondehotel;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Hotel hotel = new Hotel("mi Hotel", "Direccion 123");
        Habitacion hab = new Habitacion(1, TipoHabitacion.SIMPLE,100);
        Habitacion hab2 = new Habitacion(1, TipoHabitacion.DOBLE,150);
        hotel.agregarHabitacion(hab);
        hotel.agregarHabitacion(hab2);
        Recepcionista rec = new Recepcionista("Pepe","124356","1001");
        Recepcionista rec2 = new Recepcionista("Juan","654321","1002");
        hotel.agregarRecepcionista(rec);
        hotel.agregarRecepcionista(rec2);
        Cliente cliente1 = new Cliente("Joaquin","111111","mail@gmail.com");
        Cliente cliente2 = new Cliente("Facundo","22222","mail2@gmail.com");
        Cliente cliente3 = new Cliente("Pedro","333333","mail3@gmail.com");
        Cliente cliente4 = new Cliente("Lucas","444444","mail4@gmail.com");
        
        cliente1.realizarReserva(hotel, hab, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5));
        rec.confirmarReserva(cliente1.getReservas().get(0), hotel);
        cliente1.mostrarNotificaciones();

        cliente2.realizarReserva(hotel, hab, LocalDate.of(2025, 6, 6), LocalDate.of(2025, 6, 11));
        rec2.confirmarReserva(cliente2.getReservas().get(0), hotel);
        cliente2.mostrarNotificaciones();

        cliente3.realizarReserva(hotel, hab, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 3));
        cliente3.mostrarNotificaciones();

        cliente4.realizarReserva(hotel, hab, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5));
        cliente4.mostrarNotificaciones();

        rec.mostrarNotificaciones();
        rec2.mostrarNotificaciones();
        
        hotel.mostrarReservas();
        
        
        
        
    }
    
}
