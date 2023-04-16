package cine;

public class Asientos extends Espectador{
    private char fila;
    private int numero;
    private boolean asignado;

    public char getFila() {
        return fila;
    }
    public void setFila(char fila) {
        this.fila = fila;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isAsignado() {
        return asignado;
    }
    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }
    public Asientos(char fila,int numero, Boolean asignado) {
        super();
        this.fila = fila;
        this.numero = numero;
        this.asignado = asignado;
    }
    public Asientos(char fila,int numero){
        this.fila = fila;
        this.numero = numero;
        this.asignado = false;
    }
    public Asientos(char fila,int numero,String nombre,String apellido, int edad, int dinero) {
        super(nombre,apellido, edad, dinero);
        this.fila = fila;
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "Asiento [fila=" + fila + ", numero=" + numero + "]";
    }


    
    
}
