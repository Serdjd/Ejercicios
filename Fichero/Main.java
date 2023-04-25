package Fichero;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        String palabra_salida=("exit");
        String palabra_entrada=("");
        //Con el filereader podemos leer lo que hay en el archivo
        FileWriter out = new FileWriter("/home/serdjd_05/Pa ficheros.txt",true);
        //Con el filewriter escribimos dentro del archivo y si añadimo true lo anterior no lo borramos
        Scanner leer = new Scanner(System.in);
        while(palabra_entrada.compareTo(palabra_salida)!=0){
            System.out.println("Dime lo que quieras añadir al fichero");
            palabra_entrada = leer.nextLine();
            if(palabra_entrada.compareTo(palabra_salida)!=0){
                out.write("\n"+palabra_entrada);
            }
        }
            out.close();
            leer.close();
    }
    
}
