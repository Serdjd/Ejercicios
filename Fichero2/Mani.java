package Fichero2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Mani {
    public static void main(String[] args) throws Exception{
        int numero_salida = 0;
        int numero_leido=1;
        int contador1 = 0;
        int contador2;
        Scanner leer = new Scanner(System.in);
        FileReader in = new FileReader("/home/serdjd_05/numeros.txt");
        FileWriter out = new FileWriter("/home/serdjd_05/numeros.txt");
        Scanner leer_archivo = new Scanner(in);
        while(numero_leido!=numero_salida){
            System.out.println("Dime un número: ");
                    numero_leido=leer.nextInt();
                if(numero_leido!=numero_salida){
                    out.write(" "+numero_leido);
                    contador1++;
                }
            }
        out.close();
        contador2=contador1;
        while(leer_archivo.hasNext()){
            System.out.print("El número vale "+leer_archivo.next().trim()+"y está en la posición"+(contador1-contador2));
            contador1++;
        }
    }
}
