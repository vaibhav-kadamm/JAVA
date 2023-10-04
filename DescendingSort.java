import java.util.*;

public class DescendingSort {

    static void reverseArray(int arr[]){
        int n=arr.length;

        for(int i=0;i<n/2;i++){

            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    } 
    public static void main(String[] args) {
        
        int arr[]={4,3,6,1,8,2};
        int n=arr.length;

        Arrays.sort(arr);

        reverseArray(arr);
        System.out.println("Sorted Array is"+Arrays.toString(arr));
    }
}
