package baraja;
import java.util.ArrayList;

public class Baraja {
    
    private ArrayList<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        inicializarBaraja();
    }

private void inicializarBaraja() {
    String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
    String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String palo : palos) {
        for (String valor : valores) {
            switch (palo) {
                case "Corazones" -> cartas.add(new CartaCorazones(valor));
                case "Diamantes" -> cartas.add(new CartaDiamantes(valor));
                case "Tréboles" -> cartas.add(new CartaTreboles(valor));
                case "Picas" -> cartas.add(new CartaPicas(valor));
            }
        }
        }

    // Agrego los comodines
    cartas.add(new CartaComodin("Joker 1") {});
    cartas.add(new CartaComodin("Joker 2") {});
}


    public void mostrarCartas() {
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println(cartas.get(i));
        }
    }
}

