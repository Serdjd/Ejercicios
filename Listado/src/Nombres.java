import java.util.Map;
import java.util.HashMap;
public class Nombres {
    public String rand_nombre(){
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
}
