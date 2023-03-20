package ejercicio6;
import java.util.Comparator;
//import java.util.Objects;
public class Comparador_nombre implements Comparator<Opciones>{
    @Override
    public int compare(Opciones alumno1, Opciones alumno2){
        if(alumno1.getNombre().compareTo(alumno2.getNombre())>0){
            return 1;
        }
        else{
            if(alumno1.getNombre().compareTo(alumno2.getNombre())<0){
                return -1;
            }
            else {
                return 0;
            }
        }
    }
}
