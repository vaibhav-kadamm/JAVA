

import java.util.*;

public class SelectionSort {

	static void selectionSort(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	void printArray(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n;++i) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		SelectionSort ss=new SelectionSort();
		int arr[]= {9,7,66,54,2,21,};
		ss.selectionSort(arr);
		
		System.out.println("Sorted Array");
		ss.printArray(arr);
		
		
	}
	
}

