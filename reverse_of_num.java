package lec5;

import java.util.Scanner;

public class reverse_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int sum=0;
		int mul=9;
		while(n>0) {
		     int rem=n%10;
		     sum = sum + rem*;
		     mul=mul*10;
			n=n/10;
		}
		System.out.println(sum);

	}

}
