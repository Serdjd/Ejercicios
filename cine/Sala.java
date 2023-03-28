package cine;

public class Sala {
    private StringBuilder[][]  sala;
    
    public StringBuilder[][] getSala() {
        return sala;
        
    }
    public void setSala(StringBuilder [][] sala) {
        this.sala = sala;
    }
    
    public Sala(Pelicula_ film) {
        this.sala = Generar_sala(film);
    }

    public static StringBuilder [][] Generar_sala(Pelicula_ film){
        StringBuilder hall[][] = new StringBuilder[10][9];
        String letras = "ABCDEFGHI";
        for(int i=0;i<9;i++){
            for(int j=0;j<8;j++){
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
        for(int i=0;i<9;i++){
            for(int j=0;j<8;j++){
                System.out.print(hall[i][j]+" ");
            }
            System.out.print("\n");
        }
        return hall;
    }

}