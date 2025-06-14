package prueba;

public class Termometro {
    private double temperatura;
    
    public Termometro(double temperatura){
        this.temperatura = temperatura;
    }
    
    public double conversorAFarenheit(){
        return (temperatura - 32) * 5.0/9.0;
    }
    
    public double conversorACelsius(){
        return (temperatura * 9.0/5.0) + 32;
    }
    
    public double nuevaTemperatura(double temperaturaNueva) {
        return this.temperatura += temperaturaNueva;
    }
    
    public void mostrarInfo(){
        double temperaturaCelsius = conversorACelsius();
        double temperaturaFarenheit = conversorAFarenheit();
        System.out.println("La temperatura es: " + temperatura + " en celsius; " +
                temperaturaCelsius + " y en farenheit; " + temperaturaFarenheit);
    }
}
