package Cine.src;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Generadores {
    public static final String Red="\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static boolean rand_aginacion(){
        int i = (int)Math.floor(Math.random()*2+1);
        if(i==2){
            return false;
        }
        else{
            return true;
        }
    }
    public static String peli(){
        Map<Integer,String> pelis = new HashMap<>();
        Scanner src = new Scanner(System.in);
        pelis.put(1,"Avatar 2");
        pelis.put(2,"Lord of the rings");
        pelis.put(3,"Wakanda Forever");
        pelis.put(4,"El bueno, el feo y el malo");
        pelis.put(5,"Avengers: End Game");
        System.out.println("Selecciona una pelicula:\nAvatar 2-->1\nLord of the rings-->2\nWakanda Forever-->3\nEl bueno, el feo y el malo-->4\nAvengers: End Game-->5\n");
        int num = src.nextInt();
        return pelis.get(num);
    }
    public static int rand_precios(String pelicula){
        Map<String,Integer> precio = new HashMap<>();
        precio.put("Avatar 2",12);
        precio.put("Lord of the rings",15);
        precio.put("Wakanda Forever",5);
        precio.put("El bueno, el feo y el malo",9);
        precio.put("Avengers: End Game",9);
        return precio.get(pelicula);
    }
    public static int rand_duracion(String pelicula){
        Map<String,Integer> duracion = new HashMap<>();
        duracion.put("Avatar 2",180);
        duracion.put("Lord of the rings",150);
        duracion.put("Wakanda Forever",120);
        duracion.put("El bueno, el feo y el malo",90);
        duracion.put("Avengers: End Game",180);
        return duracion.get(pelicula);
    }
    public static int rand_edad(String pelicula){
        Map<String,Integer> edad = new HashMap<>();
        edad.put("Avatar 2",12);
        edad.put("Lord of the rings",15);
        edad.put("Wakanda Forever",5);
        edad.put("El bueno, el feo y el malo",18);
        edad.put("Avengers: End Game",10);
        return edad.get(pelicula);
    }
    public static String rand_director(String pelicula){
        Map<String,String> director = new HashMap<>();
        director.put("Avatar 2","James Cameron");
        director.put("Lord of the rings","Peter Jackson");
        director.put("Wakanda Forever","Ryan Coogler");
        director.put("El bueno, el feo y el malo","Sergio Leone");
        director.put("Avengers: End Game","Anthony Russo");
        return director.get(pelicula);
    }
    public static String rand_nombre(){
        int a = (int) Math.floor(Math.random()*7+1);
        Map<Integer,String> nombres = new HashMap<>();
        nombres.put(1,"Pepe");
        nombres.put(2,"Javier");
        nombres.put(3,"Juan Paco");
        nombres.put(4,"Manuel");
        nombres.put(5,"Raul");
        nombres.put(6,"Alex");
        nombres.put(7,"Andrés");
        return nombres.get(a);
    }
    public static String rand_apellido(){
        int a = (int) Math.floor(Math.random()*7+1);
        Map<Integer,String> apellidos = new HashMap<>();
        apellidos.put(1,"Gonzalez");
        apellidos.put(2,"Muñoz");
        apellidos.put(3,"Perez");
        apellidos.put(4,"Canovas");
        apellidos.put(5,"Gutierrez");
        apellidos.put(6,"Sotos");
        apellidos.put(7,"Arriza");
        return apellidos.get(a);
    }  
}
