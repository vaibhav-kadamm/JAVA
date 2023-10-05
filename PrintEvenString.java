import java.util.*;

public class PrintEvenString{

    static void printString(String s){
        for(String word:s.split(" ")){

            if(word.length()%2==0){
               System.out.println(word);

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        
        String s=sc.nextLine();
        printString(s);
    }
}