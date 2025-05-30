package robot;

public class Main {
    public static void main(String[] args) {
        
        Robot rl = new RobotLimpiador();
        Robot rc = new RobotCocinero();
        
        rl.trabajar();
        rc.trabajar();
    }
}
