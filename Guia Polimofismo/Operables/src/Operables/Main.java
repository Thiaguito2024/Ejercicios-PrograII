package Operables;

public class Main {
    public static void main(String[] args) {
        
        Operable c = new Calculadora();
        Operable rq = new RobotQuirurjico();
        
        c.operar();
        rq.operar();
    }
}
