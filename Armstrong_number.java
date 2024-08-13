package Lec6;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		System.out.println(Aremstrong(n));
		

	}
	public static boolean Aremstrong(int n) {
		int cnn=Count(n);
		int p=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem, cnn));
			n/=10;
		}
		if(sum==p) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public static int Count(int n ) {
		int cn =0;
		while(n>0) {
			cn++;
			n/=10;
		}
		return cn;
	}

}
