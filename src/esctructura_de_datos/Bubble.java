package esctructura_de_datos;

public class Bubble {
    public int[] toSort(int rNumbers[]){
        int temp;
        for(int i = rNumbers.length - 1; i >= 0; i--){
            for(int j = 0; i > j; j++){
                if(rNumbers[j] > rNumbers[j+1]){
                    temp = rNumbers[j];
                    rNumbers[j] = rNumbers[j+1];
                    rNumbers[j+1] = temp;
                }
            }
        }
        return rNumbers;
    }
}
