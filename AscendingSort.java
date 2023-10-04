import  java.util.*;
public class AscendingSort {
        static int length;

        static void printArray(int arr[]){
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int arr[]){
        int temp;

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
              if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        int arr[]={5,3,1,2,8,6};
        length=arr.length;

        sort(arr);
        System.out.println("Elements of Sorted Array are: ");
        printArray(arr);
        
    }
}
