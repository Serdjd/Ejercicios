package cine;

public class Pelicula_ extends Cine_{
    private String titulo;
    private int duracion;
    private int edad_minima;
    private String director;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getEdad_minima() {
        return edad_minima;
    }
    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Pelicula_(String pelicula) {
        super(pelicula);
        this.titulo = pelicula;
        this.duracion = Generadores.rand_duracion(pelicula);
        this.edad_minima = Generadores.rand_edad(pelicula);
        this.director = Generadores.rand_director(pelicula);
    }
    
}
