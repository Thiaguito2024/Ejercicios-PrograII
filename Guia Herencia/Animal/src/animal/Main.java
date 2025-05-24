package animal;

public class Main {
    public static void main(String[] args) {
        
        Leon l = new Leon("Leon", 20){};
    
        l.alimentarse();
        
        Elefante e = new Elefante("Elefante", 10){};
        
        e.alimentarse();
    }
}
