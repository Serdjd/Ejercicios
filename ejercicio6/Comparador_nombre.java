package ejercicio6;
import java.util.Comparator;
import java.util.Objects;
public class Comparador_nombre implements Comparator<Opciones>{
    @Override
    public int compare(Opciones alumno1, Opciones alumno2){
        if(Objects.equals(alumno1, alumno2)){
            return -1;
        }
        else{
            return 0;
        }
    }
}
