import java.util.Scanner;

public class Factorial_using_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
      System.out.println("The Factorial of given number is:"+fact);
    }
}
