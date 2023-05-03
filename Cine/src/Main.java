

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws Exception{
        Pelicula_ film = new Pelicula_(Generadores.peli());
        Boolean asignacion;
        int contador=0;
        ArrayList<Asientos> lista = new ArrayList<Asientos>();
        ArrayList<String>libres = new ArrayList<String>();
            String letras = "ABCDEFGHI";
            for(int i=0;i<9;i++){
                
                for(int j=0;j<8;j++){
                    
                    asignacion = Generadores.rand_aginacion();
                    if(asignacion==true){
                        Asientos butaca = new Asientos(letras.charAt(i),j,asignacion);
                        if(butaca.getDinero()>=film.getPrecio()){

                            if(butaca.getEdad()>=film.getEdad_minima()){
                                    butaca.setDinero(butaca.getDinero()-film.getPrecio());
                                    lista.add(butaca);
                            }

                            else{
                                    System.out.println(butaca.getNombre()+butaca.getApellido()+" no tiene la edad suficiente");
                                    Asientos butacon = new Asientos(letras.charAt(i),j);
                                    lista.add(butacon);
                            } 

                        }

                        else{
                                System.out.println(butaca.getNombre()+butaca.getApellido()+" no tiene suficiente dinero");
                                Asientos butacon = new Asientos(letras.charAt(i),j);
                                lista.add(butacon);
                        }                    

                    }
                    else{
                        Asientos butaca = new Asientos(letras.charAt(i),j);
                        lista.add(butaca);
                    }
                    if(lista.get(contador).isAsignado()==false){
                        libres.add(lista.get(contador).toString());
                    }
                    contador++;
                }
            }
            System.out.println("Los siguientes asientos están libres");
            System.out.println(libres.toString());
            Scanner leer = new Scanner(System.in);
                    System.out.print("Fila: ");
                    char fila=leer.nextLine().charAt(0);
                    System.out.print("Número de butaca: ");
                    int numero=leer.nextInt();
                    leer.nextLine();
                        for(int i=0;i<lista.size();i++){
                            if((Character.compare(fila, lista.get(i).getFila())==0)&&(numero==lista.get(i).getNumero())){
                            System.out.println("El asiento está libre, meta sus datos para ver si cumple los requisitos");
                            System.out.println("Nombre: ");
                            String nombre = leer.nextLine();
                            System.out.println("Apellido: ");
                            String apellido = leer.nextLine();
                            System.out.println("Edad: ");
                            int edad = leer.nextInt();
                            System.out.println("Dinero: ");
                            int dinero = leer.nextInt();
                            leer.nextLine();
                            Asientos asiento = new Asientos(fila, numero, nombre, apellido, edad, dinero);
                            if(asiento.getDinero()>=film.getPrecio()){
                                if(asiento.getEdad()>=film.getEdad_minima()){
                                    asiento.setDinero(asiento.getDinero()-film.getPrecio());
                                    lista.remove(i);
                                    lista.add(asiento);
                                    break;
                                }
                                else{
                                    System.out.println(asiento.getNombre()+asiento.getApellido()+" no tiene la edad suficiente");
                                }
                            }
                            else{
                                System.out.println(asiento.getNombre()+asiento.getApellido()+" no tiene suficiente dinero");
                            }           
                        }
            }

}
}       
