import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your phrase");
        String sentence = scan.nextLine();
       
        String reversed = "";
        for(int i = sentence.length(); i > 0; i--){
            reversed += sentence.charAt(i-1);
        }

        System.out.println(reversed);
    }
}