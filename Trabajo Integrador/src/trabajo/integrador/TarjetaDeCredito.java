package trabajo.integrador;

public class TarjetaDeCredito {

    private String entidadBancaria;
    private String entidadFinanciera;
    private int numeroTarjeta;
    private double saldoDisponible;
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String mail;
    private Posnet p;
    
    public TarjetaDeCredito(){
        
    }
    
    public TarjetaDeCredito(String entidadBancaria, String entidadFinanciera, int numeroTarjeta, double saldoDisponible, int dni, String nombre, String apellido, int telefono, String mail) {
        this.entidadBancaria = entidadBancaria;
        controlEntidadBancaria();
        this.entidadFinanciera = entidadFinanciera;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
    
    public void controlEntidadBancaria(){
        if (!entidadBancaria.equalsIgnoreCase("Visa") && !entidadBancaria.equalsIgnoreCase("Mastercard")) {
            throw new IllegalArgumentException("Solo tarjetas Visa o Mastercard");
        }
    }
            
    public double getSaldo() {
        return saldoDisponible;
    }
    
    public double descontarSaldo(double monto){
        return saldoDisponible -= monto;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
}
