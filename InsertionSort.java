
import java.util.*;

public class InsertionSort {

	static void insertionSort(int arr[]) {
		int n=arr.length;
		
		for(int i=1;i<n;++i) {
			int temp=arr[i];
			int j=i-1;
		
		while(j>=0 && arr[j]>temp) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=temp;
		}
	}
	void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;++i) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		InsertionSort is =new InsertionSort();
		int arr[]= {9,4,5,2,7,1};
		
		is.insertionSort(arr);
		
		System.out.println("Sorted Array");
		
		is.printArray(arr);
	}
}
