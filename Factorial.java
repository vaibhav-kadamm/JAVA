import java.util.Scanner;

class fact{
   
 int factwthoutmul(int n){
    int ans=n;   //5
       for(int i=n-1;i>1;i--){
        int sum=0;
          for(int j=0;j<i;j++){
            sum+=ans;
          }
         ans=sum;
       }
        return ans;
    }

    
   
}

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        // int i,fact=1;
   
        fact f=new fact();

        int fact=f.factwthoutmul(n);

        System.out.println(fact);
        // for(i=1;i<=n;i++){
        //   fact=fact*i;
        // 
  }
        
  
}
