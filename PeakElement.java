import java.util.Scanner;

class PeakElement{
    static int peak(int arr[],int n){

        if(n==0){
            return 0;
        }
        if(arr[0]>=arr[1]){
            return 0;
        }
        if(arr[n-1]>=arr[n-2]){
            return n-1;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Elements you want to enter");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
        int peakIndex=peak(arr,n);
        if(peakIndex!=0){
        System.out.println("Index of Peak Element is:"+peakIndex);
        }
        else{
            System.out.println("NO Peak");
        }
    }
}