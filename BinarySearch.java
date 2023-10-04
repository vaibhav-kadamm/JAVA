import java.util.*;

public class BinarySearch {
    
    static int search(int arr[],int l,int r,int x){

        while(l<=r){
           int mid=(l+r)/2;

           if(arr[mid]==x){
            return mid;
           }
           else if(arr[mid]>x){
            r=mid-1;
           }
           else{
            l=mid+1;
           }
        }
           return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={5,4,1,2,3};
        int n=arr.length;
        System.out.println("Enter the element you want to search");
        int x=sc.nextInt();

        int index=search(arr, 0, n-1, x);

        if(index==-1){
            System.out.println("Element is not Found");
        }
        else{
            System.out.println("Element is Found at "+index);
        }


    }
}
