import java.util.Scanner;

public class primeRecursion {

static boolean checkPrime(int n,int i){
    if(n<=1){
        return false;
    }
    else if(i<=n/2){
        if(n%i==0){
            return false;
        }
            else{
            return checkPrime(n,i+1);
            }
        }
        else{
        return true;
    }
}
   


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean flag=checkPrime(n,2);
        if(flag)
        System.out.println("Given No is prime");
        else{
            System.out.println("Not prime");
        }
    }
}
