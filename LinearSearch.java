import java.util.*;

public class LinearSearch {
    
    static int search(int arr[],int n,int x){

        for(int i=0;i<n;i++){
        if(arr[i]==x){
            return i;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={2,4,1,7,8};
        int n=arr.length;
        System.out.println("Enter the element you wamt to Search");
        int x=sc.nextInt();
       int index= search(arr,n,x);

       if(index==-1){
        System.out.println("Element is not found");
       }
       else{
        System.out.println("Element is Found at "+index);
       }
    
    }
}
