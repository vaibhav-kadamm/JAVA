package javac;

import java.util.*;
public class arrayc {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a[]=new int[15];
		int n;
		System.out.println("Enter The number");
		n=sc.nextInt();
		System.out.println("Enter the Element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Display the values");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	 
}
