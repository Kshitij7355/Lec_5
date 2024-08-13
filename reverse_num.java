package lec5;
import java.util.*;
public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum*10+rem;
			n/=10;
		}
		System.out.println(sum);


	}

}
