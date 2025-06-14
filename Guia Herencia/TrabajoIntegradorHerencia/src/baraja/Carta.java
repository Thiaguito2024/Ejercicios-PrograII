package baraja;

public abstract class Carta{
    
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String toString() {
        return valor + " de " + palo;
    }
}

