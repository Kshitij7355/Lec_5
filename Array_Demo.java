package Lec6;

public class Array_Demo {

	public static void main(String[] args) {
		int[]arr = new int[5];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		//print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		int[]other = arr;
		other[2]=-9;
		System.out.println(arr[2]);
	
	}

}
