package cine;

public class Main {
    public static void main(String[]args) throws Exception{
        public static final String Red="\u001B[31m";
        public static final String Green = "\u001B[32m";
        public static final String Reset = "\u001B[0m";
        Pelicula_ film = new Pelicula_(Generadores.peli());
        Sala hal = new Sala(film);
            System.out.println(hal.getSala());
            String letras = "ABCDEFGHI";
            for(int i=0;i<9;i++){
                for(int j=0;j<8;j++){
                    StringBuilder str = new StringBuilder();
                    str.append(j+letras.charAt(i));
                    Asiento_libre libre = new Asiento_libre((str));
                    Asiento_ocupado ocupado = new Asiento_ocupado(str);
                    hall[i][j] = new StringBuilder();
                    String color = Generadores.rand_asientos();
                    hall[i][j].append(color+(j+1)+letras.charAt(i)+Reset);
                    if(color.equals(Red)){
                            Espectador publico = new Espectador();
                        if(publico.getDinero()>=film.getPrecio()){
                            if(publico.getEdad()>=film.getEdad_minima()){
                                
                            }
                            else{
                                System.out.println(publico.getNombre()+publico.getApellido()+" no tiene la edad suficiente");
                            }
                        }
                        else{
                            System.out.println(publico.getNombre()+publico.getApellido()+" no tiene suficiente dinero");
                        }                    
                    }
                }
            }
    }
}
