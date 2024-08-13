package Lec6;

import java.util.Scanner;

public class Arrays_Input {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Display(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}

	}
	public static void Display(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
