import java.util.Scanner;

public class SumOfDigits {

static int sumOfdigits(int n){
 int sum=0;

 while(n>0){
    int r=n%10;
    sum+=r;
    n/=10;
 }
return sum;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=sumOfdigits(n);
        System.out.println("The sum of all number is:"+sum);
    }
}
