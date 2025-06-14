package transporte;

class Bicicleta extends Transporte {
    
    public Bicicleta(int velocidad) {
        super(velocidad);
    }

    public void tocarBocina() {
        System.out.println("Bicicleta tocando bocina");
    }
}