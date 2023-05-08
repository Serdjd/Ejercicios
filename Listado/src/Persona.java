public class Persona {
    private String nombre;
    private int edad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = (int) Math.floor(Math.random()*60+4);
    }
    public Persona(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    }
