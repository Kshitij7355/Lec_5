package Lec6;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int target =s.nextInt();
		System.out.println(Search(arr,target));

	}
	public static int Search(int[]arr , int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
