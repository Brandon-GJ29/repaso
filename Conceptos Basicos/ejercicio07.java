import java.util.ArrayList;
import java.util.Random;
public class ejercicio07 {
    public static void main(String[] arg){
        //7.Dado un arreglo de enteros, elimina los elementos duplicados.
        
        int array[] = new int[5];
        ArrayList<Integer> auxiliar=new ArrayList<>();
     //   int arrayAux[] = new int[5];
        Random rand = new Random();
        for (int i =0; i<array.length;i++){ 
            array[i]= rand.nextInt(5);
        }
        
        
        
        for (int i =0; i<array.length;i++){ 
            boolean duplicate=false;
            for(int j=0;j<array.length;j++){
                System.out.print("i: "+array[i]+" j: "+array[j]+"\n");
                if(i==j){
                
                }else{
                    if (array[i]==array[j]){
                    duplicate= true;
                    System.out.print("Duplicado\n ");
                }
                }
            }

            if (duplicate!=true) {
                auxiliar.add(array[i]);
            }
        }

        
        System.out.println("Original");
        
        for (int i =0; i<array.length;i++){ 
            System.out.println(array[i]);
        }
        System.out.println("Nuevo");

        for (int i =0; i<auxiliar.size();i++){ 
            System.out.println(auxiliar.get(i));
        }



    
    }
    
}
