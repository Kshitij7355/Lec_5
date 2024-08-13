package Lec6;

import java.util.Scanner;

public class Array_Swap_Demo_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);
		
		

	}
	public static void Swap(int[]arr,int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
