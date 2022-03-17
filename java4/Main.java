import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        
        LinkedList<String> words = new LinkedList<String>();
        
        while(words.size()<5){
            String word = scanner.nextLine();
            words.add(word);
            //add the word to LinkedList
            
        }
        System.out.println("==========Result begins================");
        //your code goes here
        for (String s : words){
            if (s.length()>4){
                System.out.println(s);
            }
        }
        System.out.println("==========Result ends================");
        
        
    }
}