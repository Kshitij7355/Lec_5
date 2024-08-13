package lec5;
import java.util.*;
public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1=s.nextInt();
		int count=0;
		while(n>0) {
			int rem=n%10;
			if(rem==n1) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
		
	}

}
