package lec5;
import java.util.*;
public class position_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int mul=1;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			if(rem==0) {
				rem=5;
			}
			sum=sum+rem*mul;
			mul=mul*10;
			n=n/10;
		}
		System.out.println(sum);
		

	}

}
