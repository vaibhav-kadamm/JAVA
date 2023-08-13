import java.util.Scanner;

class prime{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no you want: ");
        int n=sc.nextInt();
        int i,flag=0;
        int m=n/2;
        if(n==0 || n==1){
            System.out.println("Given No is not prime");
        }
        else{
            for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println("Not prime");
                flag=1;
                break;
            }
            }
            if(flag==0){
                System.out.println("Given No is prime no");
            }
        }
    }
}