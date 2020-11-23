package Test2015;

public class Question4 {
	public static int bitonicMax(int[] arr){
		int high = arr.length-1;
		int low = 0;
	return assictance (high,low,arr); 
	}
	public static int assictance (int high , int low ,int arr[] ) {
		int mid = (high + low ) /2 ;
		int index=0 ;
		if(arr[mid] > arr[mid-1] &&arr[mid] > arr[mid+1]) {
			index = mid;
			
		}
		if (arr[mid] < arr[mid -1]) {
			assictance (mid-1,low,arr);    // O(logn)
		}else {
			assictance (mid+1,high,arr);    // O(logn)
		}
		return index;
	}
	public static void main (String arg []) {
		int a [] = {2,100,90,70,60,50,45,44,30};
		System.out.println(bitonicMax(a));
	}
}
