import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                cnt++;
            }

        }
        System.out.println("The Number of character in string is:"+(s.length()-cnt));
      
    }
}
