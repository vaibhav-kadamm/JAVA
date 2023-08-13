
import java.util.Scanner;
public class Armstrong {
    static boolean isArmstrong(int n) {
        		int sum=0;int temp=n;
        			while(temp>0 ) {   //371
        				int r=temp%10; //371%10=1
        				sum=sum+(r*r*r);  //0+1*1*1=1+
        				temp=temp/10;//371/10=37
        			}
        			if(n==sum)
        				return true;
                        else{
        			return false;
        		}
            }
        
        	
        	public static void main(String[] args) {
        		Scanner sc =new Scanner(System.in);
        		System.out.println("Enter the number:");
        		int n=sc.nextInt();
        		boolean flag=isArmstrong(n);
        		if(flag)
        			System.out.println("Armstrong");
        		else
        			System.out.println("Not Armstrong");
        	}
        	
        	
        	
        }

