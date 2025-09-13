import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] arg){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Ingresa unu numero:");
        int numero= scan.nextInt();

        for (int i = 0; i<= numero; i++){
            if (i%3 ==0){
                 System.out.println(i+" Es multiplo de 3  -> Fizz");
            } else if (i%5==0){
                  System.out.println(i+" Es multiplo de 5  -> Buzz");
            }
            else{
                 System.out.println(i+" Otro caso");
            }
            
        }
    }
}
