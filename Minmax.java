import java.util.Scanner;
import java.util.*;

public class Minmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Elements you want to enter");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[0]+ " is mininmum element " +arr[n-1]+" is Maximum element");
    }
}
