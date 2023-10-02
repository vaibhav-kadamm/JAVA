package javac;

import java.util.*;

public class array1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		System.out.println("Display values");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		
		if(a[i]>a[0]) {
			max=a[i];
		}
				}
		System.out.println("Max value is "+ max);
	}
	
}
