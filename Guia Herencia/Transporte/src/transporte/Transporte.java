package transporte;

class Transporte {
    private int velocidad;

    public Transporte(int velocidad) {
        this.velocidad = velocidad;
    }

    public void mostrarInformacion() {
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
}