package cine;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[]args) throws Exception{
        final String Red="\u001B[31m";
        final String Green = "\u001B[32m";
        final String Reset = "\u001B[0m";
        Pelicula_ film = new Pelicula_(Generadores.peli());
            String letras = "ABCDEFGHI";
            StringBuilder hall[][] = new StringBuilder[10][9];
            ArrayList<Object> lista = new ArrayList<>();
            for(int i=0;i<9;i++){
                for(int j=0;j<8;j++){
                    StringBuilder str = new StringBuilder();
                    str.append(j+letras.charAt(i));
                    hall[i][j] = new StringBuilder();
                    String color = Generadores.rand_asientos();
                    hall[i][j].append(color+(j+1)+letras.charAt(i)+Reset);
                    if(color.equals(Red)){
                            Asiento_ocupado ocupado = new Asiento_ocupado(str);
                        if(ocupado.getDinero()>=film.getPrecio()){
                            if(ocupado.getEdad()>=film.getEdad_minima()){
                                ocupado.setDinero(ocupado.getDinero()-film.getPrecio());
                                lista.add(ocupado);
                            }
                            else{
                                System.out.println(ocupado.getNombre()+ocupado.getApellido()+" no tiene la edad suficiente");
                                Asiento_libre libre = new Asiento_libre(str);
                                lista.add(libre);
                            }
                        }
                        else{
                            System.out.println(ocupado.getNombre()+ocupado.getApellido()+" no tiene suficiente dinero");
                            Asiento_libre libre = new Asiento_libre(str);
                            lista.add(libre);
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
            Scanner leer = new Scanner(System.in);
            StringBuilder src = new StringBuilder();
            Map<Character,Integer> lettersMap = new HashMap<>();
                lettersMap.put('A',1);
                lettersMap.put('B',2);
                lettersMap.put('C',3);
                lettersMap.put('D',4);
                lettersMap.put('E',5);
                lettersMap.put('F',6);
                lettersMap.put('G',7);
                lettersMap.put('H',8);
                lettersMap.put('I',9);
            System.out.println("Los asientos verdes están libres y los rojos están ocupados");
            System.out.println("Asiento");
            src.append(leer.nextLine());
                if(lista.get(lettersMap.get(src.charAt(1))+(int)src.charAt(0)-'1')instanceof Asiento_libre){
                    System.out.println("El asiento está libre, meta sus datos para ver si cumple los requisitos");
                    System.out.println("Nombre: ");
                    String nombre = leer.nextLine();
                    System.out.println("Apellido: ");
                    String apellido = leer.nextLine();
                    System.out.println("Edad: ");
                    int edad = leer.nextInt();
                    System.out.println("Dinero: ");
                    int dinero = leer.nextInt();
                    Asiento_ocupado Ocupado = new Asiento_ocupado(src, nombre, apellido, edad, dinero);
                    if(Ocupado.getDinero()>=film.getPrecio()){
                        if(Ocupado.getEdad()>=film.getEdad_minima()){
                            Ocupado.setDinero(Ocupado.getDinero()-film.getPrecio());
                            lista.remove(lettersMap.get(src.charAt(1))+(int)src.charAt(0)-'1');
                            lista.add(lettersMap.get(src.charAt(1))+(int)src.charAt(0)-'1',Ocupado);
                        }
                        else{
                            System.out.println(Ocupado.getNombre()+Ocupado.getApellido()+" no tiene la edad suficiente");
                        }
                    }
                    else{
                        System.out.println(Ocupado.getNombre()+Ocupado.getApellido()+" no tiene suficiente dinero");
                    }           
                }
    }
            
}       
