package cine;

public class Main {
    public static void main(String[]args) throws Exception{
        Pelicula_ film = new Pelicula_(Generadores.peli());
        Sala hal = new Sala(film);
        StringBuilder all[][],pers[][];
        all = new StringBuilder[9][8];
        pers = new StringBuilder[9][8];
        all=hal.getSala(0);
        pers = hal.getSala(1);
                System.out.println(hal.getSala(0));
        
    }
}
