package reloj;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void ajustarHora(int nuevaHora) {
        if (nuevaHora >= 0 && nuevaHora < 24) {
            this.hora = nuevaHora;
        }
    }

    public void ajustarMinuto(int nuevoMinuto) {
        if (nuevoMinuto >= 0 && nuevoMinuto < 60) {
            this.minuto = nuevoMinuto;
        }
    }

    public void ajustarSegundo(int nuevoSegundo) {
        if (nuevoSegundo >= 0 && nuevoSegundo < 60) {
            this.segundo = nuevoSegundo;
        }
    }

    public void avanzarUnSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    public void mostrarHora() {
        System.out.println("Hora actual: " + hora + ":" + minuto + ":" + segundo);
    }
}