import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
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
            FileWriter out = new FileWriter(archivo);
            Persona person = new Persona(null, 0);
            ArrayList<Persona> lista = new ArrayList<>();
             
    }
}
