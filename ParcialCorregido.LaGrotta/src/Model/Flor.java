package Model;

import Enum.TemporadaFlorecimiento;
import Interfaces.DesprenderAroma;

public class Flor extends Planta implements DesprenderAroma{
    
    private TemporadaFlorecimiento tempFlorecimiento;

    public Flor(String nombre, String ubicacion, String clima, TemporadaFlorecimiento tempFlorecimiento) {
        super(nombre, ubicacion, clima);
        this.tempFlorecimiento = tempFlorecimiento;
    }
    
    public TemporadaFlorecimiento getTempFlorecimiento(){
        return tempFlorecimiento;
    }
    
    @Override
    public void desprenderAroma(){
        System.out.println("Flor " + getNombre() + " desprendiendo aroma");
    }

    @Override
    public String toString() {
        return "Flor: " + "\nTemporada de florecimiento: " + tempFlorecimiento.name().toLowerCase() + "\n" + super.toString();
    }
}
