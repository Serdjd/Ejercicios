import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main (String[] args) throws Exception{
            File archivo = new File("/home/serdjd_05/Persondata.txt");
            if(!archivo.isFile()){
                System.out.println("El archivo no existe");
                System.exit(0);
            }
            FileReader in = new FileReader(archivo);
            FileWriter out = new FileWriter(archivo);
            Nombres names = new Nombres();
            Scanner leer = new Scanner(System.in);
            ArrayList<Persona> lista = new ArrayList<>();
            System.out.println("Número de personas: ");
            int numero_pers = leer.nextInt();
            Scanner leer_archivo = new Scanner(archivo);
        if(leer_archivo.hasNext()==false){
            for(int i=0;i<numero_pers;i++){
                Persona person = new Persona(names.rand_nombre());
                lista.add(person);
            }
        }
        /*
        hay que ver como se guardan los objetos
        int exit=1;
        int contador=0;
        int[] list = new int[numero_pers];
        Quicksort algoritmo = new Quicksort();
        while(exit!=0){
            System.out.println("Mostrar listado --> 1\nOrdenar por edad --> 2\nOrdenar alfabeticamente -->3\nAñadir personas -->4\nSalir del programa -->0");
            exit=leer.nextInt();
            switch(exit){
                case 1:
                while(leer_archivo.hasNext()){
                    System.out.println(leer_archivo.next().trim());
                    contador+=1;
                    if(contador/2!=0){
                        System.out.println("\n");
                    }
                    else{
                        System.out.println(" ");
                    }
                }
                contador=0;
                break;
                case 2:
                while(leer_archivo.hasNext()){
                    
                    list[contador]=leer_archivo.nextInt();
                    contador+=1;
                }
                algoritmo.sort(list,list[0],list[contador-1]);
            }
        }*/
          
            

             
    }

}
