package televisor;

public class Televisor {
 
      private final int MAX_CANAL = 99;
      private final int MIN_CANAL = 1;
      private final static int INITIAL_CANAL = 10;
      private String marca;
      private double tamanio;
      private int volumen;
      private int canal;
      private boolean encendido;
      private static int nextNroSerie = 10000;
      private int nroSerie;
      private final int MAX_VOL = 99;
      private final int MIN_VOl = 1;
      private boolean mute;
 
    // Constructor
    public Televisor(String marca, double tamanio) {
          this.marca = marca;
          validarTamanio(tamanio);
          this.tamanio = tamanio;
          canal = INITIAL_CANAL;
          nroSerie = nextNroSerie ;
          nextNroSerie = nextNroSerie ++;
    }
 
    // Método para validar el tamaño
    private void validarTamanio(double tamanio) {
          if (tamanio <= 0) {
              throw new RuntimeException("Tamanio invalido");
          }
    }
 
    public void encender(){
          if(encendido){
              System.out.println("Ya estoy encendido");
          } else {
              encendido = true;
          }
    }
 
    // Método para mostrar la información
    public void mostrarInfo() {
          System.out.println("Marca: " + marca +
                             "\nTamanio: " + tamanio +
                             "\nEncendido: " + encendido +
                             "\nVolumen: " + volumen +
                             "\nCanal: " + canal);
    }
 
    private void validarEncendido(){
          if(!encendido){
              throw new IllegalStateException("Televisor apagado");
          }
    }
      
    public void subirVolumen(){
          validarEncendido();
          if (volumen > MAX_VOL){
              volumen ++;
              
          }else {
              mute = true;
          }
          mostrarVolumen();
    }
      
    public void bajarVolumen(){
          validarEncendido();
          if (volumen > MIN_VOl) {
              volumen --;
              
          }else {
              mute = true;
          }
          mostrarVolumen();
    }
      
    public void mostrarVolumen(){
          System.out.println(mute ?"Mute" : "Volumen:  " + volumen);
      }
      
    private void mostrarCanal(){
          System.out.println("Canal: " + canal);
    }
 
    public void subirCanal (){
          validarEncendido();
          if(canal <= MAX_CANAL){
          canal ++;
          } else {
              canal = MIN_CANAL;
          }
          mostrarCanal();
    }
 
    public void bajarCanal (){
          validarEncendido();
          if (canal < MIN_CANAL){
              canal --;
          } else {
              canal = MAX_CANAL;
          }
    }
 
    public void setearCanal(int target){
         validarEncendido();
         validarCanal(target);
         canal = target;
         mostrarCanal();
 
    }

    private void validarCanal(int canal){
         if (canal > MAX_CANAL || canal < MIN_CANAL){
             throw new IllegalArgumentException("Canal invalido");
         }
    }
 
}