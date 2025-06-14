package sistemadepago;

public class PagoEfectivo implements Transaccion{
    
    public PagoEfectivo(){

    }
    
    @Override
    public void procesar(){
        System.out.println("Pago en efectivo procesado");
    }
}
