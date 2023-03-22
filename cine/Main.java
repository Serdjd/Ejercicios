package cine;

public class Main {
    public static void main(String[]args) throws Exception{
        Pelicula_ film = new Pelicula_(Generadores.peli());
        Sala hall = new Sala(film);
    }
}
