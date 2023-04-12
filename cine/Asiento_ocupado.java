package cine;

public class Asiento_ocupado extends Espectador{
    private StringBuilder asiento;

    public StringBuilder getAsiento() {
        return asiento;
    }

    public void setAsiento(StringBuilder asiento) {
        this.asiento = asiento;
    }

    public Asiento_ocupado(StringBuilder asiento) {
        super();
        this.asiento = asiento;
    }
    public Asiento_ocupado(StringBuilder asiento,String nombre,String apellido, int edad, int dinero) {
        super(nombre,apellido, edad, dinero);
        this.asiento = asiento;
    }
    @Override
    public String toString() {
        return "" + asiento + "";
    }
    
    
}
