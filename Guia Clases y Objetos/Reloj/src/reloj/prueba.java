package reloj;

public class prueba {
    public static void main(String[] args) {
        Reloj r1 = new Reloj(23, 59, 59);

        r1.mostrarHora();

        r1.avanzarUnSegundo();

        r1.mostrarHora();

        r1.ajustarHora(10);
        r1.ajustarMinuto(30);
        r1.ajustarSegundo(0);

        r1.mostrarHora();
    }
}
