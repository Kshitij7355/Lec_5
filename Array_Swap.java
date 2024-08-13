package Lec6;

public class Array_Swap {

	public static void main(String[] args) {
		int []arr = {100,20,30,40,50};
		int[]other={10,30,50,70,90};
		System.out.println(arr[0]+" "+other[0]);
		Swap(arr,other);
		System.out.println(arr[0]+" "+other[0]);

	}
	public static void Swap(int[]arr,int[]other) {
		int temp=arr[0];
		arr[0]=other[0];
		other[0]=temp;
	}
//    public static void Swap(int[]arr, int[]other) {
//    	int[]temp=arr;
//    	arr=other;
//    	other=temp;
//    }
}
