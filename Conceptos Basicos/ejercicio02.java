//2. Dado un arreglo de números , calcula la suma total.
import java.util.Scanner;

public class ejercicio02 {
    public static void main (String[] arg){
        int array[] = new int [5];
        Scanner scan = new Scanner(System.in);
        for (int i =0;i<array.length ; i++ ){
            System.out.print("Ingresa el digito ["+i+"]:");
            array [i]= scan.nextInt();
        }

        int total = 0;
        for (int j =0;j<array.length ; j++ ){
            total= total+ array[j];
        }

        System.out.println("El total es "+total);

    }
}