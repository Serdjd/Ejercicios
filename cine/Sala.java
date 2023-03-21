package cine;

public class Sala {
    public static final String Reset = "\u001B[0m";
    public StringBuilder[][] Generar_sala(){
        StringBuilder hall[][];
        hall = new StringBuilder[7][7];
        String letras = "ABCDEFGH";
        for(int i=1;i<9;i++){
            for(int j=1;j<9;j++){
                hall[i-1][j-1].append(Generadores.rand_asientos()+j+letras.charAt(i)+Reset);
            }
        }
        return hall;
    }
}
