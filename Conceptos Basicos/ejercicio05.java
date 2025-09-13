public class ejercicio05 {
    public static void main(String[] arg){
        System.out.println("Hola mundo ");

        String word = "Hola";
        String newWord="";
        for(int i=word.length() -1; i>=0;i--){
            System.out.println(word.charAt(i));
            newWord= newWord+word.charAt(i);
        }
        
        System.out.println(newWord);

    }
}
