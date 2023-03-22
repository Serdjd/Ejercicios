package cine;
import java.util.Map;
import java.util.HashMap;


public class Sala {
    private StringBuilder[][] sala;
    
    public StringBuilder[][] getSala() {
        return sala;
    }
    public void setSala(StringBuilder[][] sala) {
        this.sala = sala;
    }
    
    public Sala(Pelicula_ film) {
        this.sala = Generar_sala(film);
    }

    public static final String Red="\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Reset = "\u001B[0m";
    public static StringBuilder[][] Generar_sala(Pelicula_ film){
        StringBuilder hall[][];
        Map<StringBuilder ,Espectador> publi = new HashMap<>();
        hall = new StringBuilder[8][7];
        String letras = "ABCDEFGHI";
        int personas = 0;
        for(int i=0;i<8;i++){
            for(int j=8;j>1;j--){
                String color = Generadores.rand_asientos();
                hall[i][j-1].append(color+j+letras.charAt(i)+Reset);
                if(color.equals(Red)){
                        Espectador publico = new Espectador();
                        personas++;
                    if(publico.getDinero()>=film.getPrecio()){
                        if(publico.getEdad()>=film.getEdad_minima()){
                            publi.put(hall[i][j-1],publico);
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
        System.out.println(personas*film.getPrecio());
        return hall;
    }
}