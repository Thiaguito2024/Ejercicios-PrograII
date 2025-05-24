package pelota;

public class Prueba {
    public static void main(String[] args) {
        Pelota p1 = new Pelota("Nike", 68.5);
        Pelota p2 = new Pelota("Adidas", 68.5);

        boolean mismaCircunferencia = p1.mismaCircunferencia(p2);
        System.out.println("¿Tienen la misma circunferencia? " + mismaCircunferencia);

        p1.inflar(1.5);

        p1.mostrarInfo();

        System.out.println("¿Ahora tienen la misma circunferencia? " + mismaCircunferencia);
    }
}
