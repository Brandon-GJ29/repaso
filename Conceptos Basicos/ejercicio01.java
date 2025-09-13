
import java.util.Scanner;

public class ejercicio01{ 

    public static void main (String[] args){
        Scanner scaner= new Scanner(System.in);
        System.out.println("Digite su numero");
        int number= scaner.nextInt();
        
        if (number%2 ==0) {
            
            System.out.println("El numero " +number+ " es par");
        }else{
            
            System.out.println("El numero"+ number + " es impar");
        }

    }
}