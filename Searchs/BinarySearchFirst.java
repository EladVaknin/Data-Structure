package Searchs;

//import java.util.Arrays;

public class BinarySearchFirst {
	/**
	 * Binary search by induction
	 * @param arr - sorted array of integer numbers
	 * @param value to search
	 * @return index of value if found, otherwise return -1
	 */
	public static int binarySearchInducion(int []arr,int value){
		int ans = -1;
		if (value<arr[0])  ans = -1;
		if (value>arr[arr.length-1]) ans = -arr.length-1;
		int low = 0, high = arr.length-1;
		int middle = (low + high)/2;
		while (low <=high){
			middle = (low + high)/2;
			if (arr[middle] == value){//value was found
				ans = middle;
			}
			// value suppose to be left
			if (value < arr[middle]){
				high = middle-1;
			}
			// value suppose to be right
			else{
				low = middle+1;
			}
		}
		return ans;
	}
	public static int binary_search_recurs(int arr[],int low,int high,int value){
		int ans = -1;
		if (low <= high){
			int mid = (low+high)/2;
			if (value==arr[mid])   ans = mid;//value was found
			// value suppose to be on left
			else if (value<arr[mid]) ans = binary_search_recurs(arr, low, mid-1,value);
			// value suppose to be on right
			else ans = binary_search_recurs(arr, mid+1, high,value);
		}
		return ans;
	}
	public static int binarySearchRecursive(int arr[], int value){
		int ans = -1;
		if (value<arr[0])  ans = -1;
		if (value>arr[arr.length-1]) ans = -arr.length-1;
		ans = binary_search_recurs(arr, 0, arr.length-1,value);
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 6, 7};
		System.out.print(binarySearchInducion(arr,1)+", ");
		System.out.print(binarySearchInducion(arr,2)+", ");
		System.out.print(binarySearchInducion(arr,3)+", ");
		System.out.print(binarySearchInducion(arr,4)+", ");
		System.out.print(binarySearchInducion(arr,5)+", ");
		System.out.print(binarySearchInducion(arr,6)+", ");
		System.out.println(binarySearchInducion(arr,7)+", ");
		System.out.println();
		
		System.out.print(binarySearchRecursive(arr,1)+", ");
		System.out.print(binarySearchRecursive(arr,2)+", ");
		System.out.print(binarySearchRecursive(arr,3)+", ");
		System.out.print(binarySearchRecursive(arr,4)+", ");
		System.out.print(binarySearchRecursive(arr,5)+", ");
		System.out.print(binarySearchRecursive(arr,6)+", ");
		System.out.println(binarySearchRecursive(arr,7)+", ");
		
		int a[] = {1, 2, 6, 9};
		int ind = binarySearchInducion(a,3);
		System.out.println(ind);
	}
}
