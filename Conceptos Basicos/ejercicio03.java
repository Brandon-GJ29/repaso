import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int numero = scan.nextInt();
        int total =1;
        for (int i =numero; i>0; i--){

            total=total * i;
        
            System.out.println("El total es :"+total+" El i: "+i);

        }

        System.out.println(total);
    }
}
