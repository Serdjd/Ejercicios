package cine;

public class Sala {
    public static final String Red="\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static final String Reset = "\u001B[0m";
    public StringBuilder[][] Generar_sala(){
        StringBuilder hall[][];
        hall = new StringBuilder[8][8];
        String letras = "ABCDEFGH";
        for(int i=1;i<9;i++){
            for(int j=1;j<9;j++){
                hall[i][j].append(j+letras.charAt(i));
            }
        }
        return hall;
    }
}
