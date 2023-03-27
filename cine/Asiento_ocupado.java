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

    @Override
    public String toString() {
        return "[" + asiento + "] ocupado por: "+super.getNombre()+" "+super.getApellido();
    }
    
    
}
