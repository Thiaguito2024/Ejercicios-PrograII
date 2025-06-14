package pelota;

public class Pelota {
    private String marca;
    private double circunferencia;

    public Pelota(String marca, double circunferencia) {
        this.marca = marca;
        this.circunferencia = circunferencia;
    }

    public boolean mismaCircunferencia(Pelota otraPelota) {
        return this.circunferencia == otraPelota.circunferencia;
    }

    public void inflar(double aumento) {
        this.circunferencia += aumento;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Circunferencia: " + circunferencia + " cm");
    }
}
