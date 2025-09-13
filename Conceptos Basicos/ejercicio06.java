
//6.Implementa una función que encuentre el máximo y mínimo de un arreglo 
//sin usar funciones predefinidas.
import java.util.Random;

public class ejercicio06 {
    public static void main (String[] arg){
        
        int array []= new int[5];
        Random rand = new Random();
        
        for (int i=0;i<array.length;i++){
            array[i]= rand.nextInt(100);
            System.out.println(array[i]);
        }
        
        int low=array[0];
        int high=array[0];

        for (int i=0;i<array.length;i++){
            if(array[i]<low){
                low=array[i];
            }

            if(array[i]>high){
                high=array[i];
            }
        }

        System.out.println("El menor numero es:"+low+" El mayor numero:"+high);

    }
}
