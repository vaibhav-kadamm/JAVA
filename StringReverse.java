import java.util.*;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        String rev="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Reversed String: "+rev);
    }
}
