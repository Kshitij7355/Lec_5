package Lec6;

import java.util.Scanner;

public class Max_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
		}
		System.out.println(Max(arr));

	}
	public static int Max(int[]arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
