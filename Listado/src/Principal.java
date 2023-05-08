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
            FileWriter out = new FileWriter(archivo,true);
            Nombres names = new Nombres();
            Scanner leer = new Scanner(System.in);
            ArrayList<Persona> lista = new ArrayList<>();
            Scanner leer_archivo = new Scanner(archivo);
        if(leer_archivo.hasNext()==false){
            System.out.println("Número de personas: ");
            int numero_pers = leer.nextInt();
            for(int i=0;i<numero_pers;i++){
                Persona person = new Persona(names.rand_nombre());
                lista.add(person);
                out.write(person.getNombre()+" ");
                out.write(person.getEdad()+" "+"\n");
            }
        }
        
           
            int contador=0;
            int exit=1;
            while(exit!=0){
                System.out.println("Mostrar listado --> 1\nAñadir personas -->2\nSalir del programa -->0");
                exit=leer.nextInt();
            switch(exit){
                case 1:
                while(leer_archivo.hasNext()){
                    System.out.print(leer_archivo.next().trim());
                    contador+=1;
                    if(contador%2==0){
                        System.out.print("\n");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                contador=0;
                break;
                
                case 2:
                System.out.println("Dime nombre");
                String nombre = leer.nextLine();
                System.out.println("Dime edad");
                int edad = leer.nextInt();
                Persona people = new Persona(nombre,edad);
                out.write(people.getNombre()+" ");
                out.write(people.getEdad()+" "+"\n");
                break;

                default:
                break;
            }
    }
    out.close();
    in.close();
    leer.close();
    leer_archivo.close();
    }
}
