
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[]args) throws Exception{
        ArrayList<Opciones> Listado = new ArrayList<Opciones>();
        Scanner leer = new Scanner(System.in);
        int cantidad,nota,cerrar=1;
        String nombre;
        System.out.println("Número de alumnos");
        cantidad = leer.nextInt();
        leer.nextLine();
        for(int i = 0; i<cantidad; i++){
            System.out.println("Nombre: ");
            nombre = leer.nextLine();
            System.out.println("Nota: ");
            nota=leer.nextInt();
            leer.nextLine();
            Opciones alumno = new Opciones(nombre, nota);
            Listado.add(alumno);
        }
        System.out.println("A continuación podra cambiar los datos de los alumnos, si deseas hacerlo pulsa 1 y si no pues pulsa 2");
        cerrar=leer.nextInt();
        while(cerrar!=0){
            System.out.println("Cambiar nota --> 1\nMostrar listado --> 2\nOrdenar por nota --> 3\nOrdenar alfabeticamente -->4\nSalir del programa -->5");
            int valor=leer.nextInt();
            leer.nextLine();
            switch(valor){
                case 1:
                    System.out.println("Nombre");
                    nombre = leer.nextLine();
                    Opciones temporal = new Opciones(nombre);
                    int temp = 0;
                    for( int i=0;i<Listado.size();i++){
                        if(temporal.getNombre().equals(Listado.get(i).getNombre())){
                            temp = i;
                            break;
                        }
                    }
                    System.out.println("Nota nueva");
                    nota=leer.nextInt();
                    Listado.get(temp).setNota(nota);
                    break;
                case 2:
                for(int i=0;i<Listado.size();i++){
                    System.out.println(Listado.get(i).toString());                    
                    }
                    break;
                case 3:
                    Collections.sort(Listado,new Comparador());
                    for(int i=0;i<Listado.size();i++){
                        System.out.println(Listado.get(i).toString());
                    }
                    break;
                case 4:
                    Collections.sort(Listado, new Comparador_nombre());
                    for(int i=0;i<Listado.size();i++){
                        System.out.println(Listado.get(i).toString());                    
                    }
                    break;
                case 5:
                    cerrar = 0;
                    leer.close();
                    break;
                case default:
                    break;
            }
        }
    }
}
