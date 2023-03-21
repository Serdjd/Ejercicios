package cine;
import java.util.Map;
import java.util.HashMap;
public class Generadores {
    public static final String Red="\u001B[31m";
    public static final String Green = "\u001B[32m";
    public static String rand_asientos(){
        int i = (int)(Math.random()*1+0);
        if(i==0){
            return Red;
        }
        else{
            return Green;
        }
    }
    public static String rand_peliculas(){
        Map<Integer,String> pelis = new HashMap<>();
        pelis.put(1,"Avatar 2");
        pelis.put(2,"Lord of the rings");
        pelis.put(3,"Wakanda Forever");
        pelis.put(4,"El bueno y el malo");
        pelis.put(5,"Avengers: End Game");
        int i = (int)(Math.random()*5+1);
        return pelis.get(i);
    }
    public static int rand_precios(String peli){
        Map<String,Integer> precio = new HashMap<>();
        precio.put("Avatar 2",12);
        precio.put("Lord of the rings",15);
        precio.put("Wakanda Forever",5);
        precio.put("El bueno y el malo",9);
        precio.put("Avengers: End Game",9);
        return precio.get(peli);
    }
    public static int rand_duracion(){
        Map<String,Integer> duracion = new HashMap<>();
        duracion.put("Avatar 2",180);
        duracion.put("Lord of the rings",150);
        duracion.put("Wakanda Forever",120);
        duracion.put("El bueno y el malo",90);
        duracion.put("Avengers: End Game",180);
        return duracion.get(Cine_.getPelicula());
    }
    public static int rand_edad(){
        Map<String,Integer> edad = new HashMap<>();
        edad.put("Avatar 2",180);
        edad.put("Lord of the rings",150);
        edad.put("Wakanda Forever",120);
        edad.put("El bueno y el malo",90);
        edad.put("Avengers: End Game",180);
        return edad.get(Cine_.getPelicula());
    }
    public static String rand_director(){

    }
}
