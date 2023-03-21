package cine;

public class Cine_ {
    protected String pelicula;
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
    public Cine_(String pelicula) {
        this.pelicula = pelicula;  
        this.precio = Generadores.rand_precios(pelicula);
    }

}