package lec5;
import java.util.*;
public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();// source base 10
		int sum=0;
		int digit=9;
		int mul=10^digit;
		while(n>0) {
		     int rem=n%2;//destination base 2
		     sum = sum + rem*mul;
		     digit--;
			n=n/2;
		}
		System.out.println(sum);

	}

}
