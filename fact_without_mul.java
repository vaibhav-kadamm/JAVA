import java.util.Scanner;

public class fact_without_mul {


    static int isFact(int n){
        int i,j,ans=n;
        
        for(i=n-1;i>1;i--){
            int sum=0;
         for(j=0;j<i;j++){
            sum+=ans;
         }
         ans=sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int fact=isFact(n);
        System.out.println("The factorial is:"+fact);
    }
}
