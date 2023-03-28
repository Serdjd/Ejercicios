package cine;

public class Espectador {
    private String nombre;
    private String apellido;
    private int edad;
    private int dinero;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDinero() {
        return dinero;
    }
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public Espectador() {
        this.nombre = Generadores.rand_nombre();
        this.apellido = Generadores.rand_apellido();
        this.edad = (int) Math.floor(Math.random()*60+4);
        this.dinero = (int) Math.floor(Math.random()*73+4);
    }
    public Espectador(String nombre,String apellido, int edad, int dinero) {
        this.nombre =nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dinero = dinero;
    }
    
}
