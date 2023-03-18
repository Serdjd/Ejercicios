package ejercicio6;
public class Opciones {
    private String nombre;
    private int nota;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public Opciones(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public Opciones(String nombre){
        this.nombre=nombre;
        this.nota = 0;
    }
    @Override
    public String toString() {
        return "Nombre->" + nombre + ", Nota->" + nota;
    }
   
}