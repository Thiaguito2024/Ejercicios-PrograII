package baraja;

public abstract class Carta extends Baraja{
    
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        super();
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    public String toString() {
        return valor + " de " + palo;
    }
}

