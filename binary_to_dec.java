package lec5;
import java.util.*;
public class binary_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum =0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*mul;
			mul=mul*2;
			n=n/10;
		}
		System.out.println(sum);

	}

}
