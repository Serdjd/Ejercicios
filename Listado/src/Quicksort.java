public class Quicksort{
    public void sort(int[] lista,int min,int max ){
        int izquierda = min;
        int derecha = max;
        int pivote = lista[(izquierda+derecha)/2];
        while(min<=max){
            while(lista[izquierda]<pivote){
                izquierda++;
            }
            while(lista[derecha]>pivote){
                derecha--;
            }
            if(min<=max){
                int temp = lista[izquierda];
                lista[izquierda] = lista[derecha];
                lista[derecha] = temp;
                derecha++;
                izquierda--;
            }
        }
        if(izquierda<min){
            sort(lista, izquierda, min);
        }
        if(max<derecha){
            sort(lista, max, derecha);
        }
    }
}
