package cine;

public class Cine_ {
    private String pelicula;
    private int precio;
    public String getPelicula() {
        return pelicula;
    }
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Cine_(String pelicula, int precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }
    
}
