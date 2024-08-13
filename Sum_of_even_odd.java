package lec5;
import java.util.*;
public class Sum_of_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int pos=1;
		int sum1=0;
		int sum2=0;
		
		while(n>0) {
			int rem=n%10;
			if(pos%2==0) {
				sum2=sum2+rem;
			}else {
				sum1=sum1+rem;
			}
			pos++;
			
			n=n/10;
		}
		System.out.println(sum2);
		System.out.println(sum1);
		
		

	}

}
