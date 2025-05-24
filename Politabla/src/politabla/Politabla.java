package politabla;

public class Politabla {
    public static void main(String[] args) {
        
        A instancia;
        instancia = new A();
        System.out.println(instancia.m1());
        System.out.println(instancia.m2());
        System.out.println(instancia.m3());
        
        instancia = new B();
        System.out.println(instancia.m1());
        System.out.println(instancia.m2());
        System.out.println(instancia.m3());
        
        instancia = new C();
        System.out.println(instancia.m1());
        System.out.println(instancia.m2());
        System.out.println(instancia.m3());

    }
    
}
