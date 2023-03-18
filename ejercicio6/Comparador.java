package ejercicio6;
import java.util.Comparator;
public class Comparador implements Comparator<Opciones> {

    @Override
    public int compare(Opciones alumno1, Opciones alumno2){
        if(alumno1.getNota()>alumno2.getNota()){
            return -1;
        }
        else{
            if(alumno1.getNota()<alumno2.getNota()){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
