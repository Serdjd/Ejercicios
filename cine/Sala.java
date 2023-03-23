package cine;
import java.util.ArrayList;

public class Sala {
    private ArrayList<StringBuilder [][]>  sala;
    
    public StringBuilder[][] getSala(int num) {
        if(num==0){
            return sala.get(0);
        }
        else{
            return sala.get(1);
        }
        
    }
    public void setSala(ArrayList<StringBuilder [][]>  sala) {
        this.sala = sala;
    }
    
    public Sala(Pelicula_ film) {
        this.sala = Generar_sala(film);
    }

    public static final String Red="\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Reset = "\u001B[0m";

    public static ArrayList<ArrayList> Generar_sala(Pelicula_ film){
        ArrayList<StringBuilder [][]> salas = new ArrayList<>();
        StringBuilder hall[][] = new StringBuilder[10][9];
        ArrayList <Espectador> pers = new ArrayList<>();
        String letras = "ABCDEFGHI";
        for(int i=0;i<9;i++){
            for(int j=0;j<8;j++){
                hall[i][j] = new StringBuilder();
                pers[i][j] = new StringBuilder();
                String color = Generadores.rand_asientos();
                hall[i][j].append(color+(j+1)+letras.charAt(i)+Reset);
                if(color.equals(Red)){
                        Espectador publico = new Espectador();
                    if(publico.getDinero()>=film.getPrecio()){
                        if(publico.getEdad()>=film.getEdad_minima()){
                            pers[i][j].append(publico.getNombre()+(" ")+publico.getApellido());
                        }
                        else{
                            System.out.println(publico.getNombre()+publico.getApellido()+" no tiene la edad suficiente");
                        }
                    }
                    else{
                        System.out.println(publico.getNombre()+publico.getApellido()+" no tiene suficiente dinero");
                    }                    
                }
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<8;j++){
                System.out.print(hall[i][j]+" ");
            }
            System.out.print("\n");
        }
        salas.add(hall);
        salas.add(pers);
        return salas;
    }
}