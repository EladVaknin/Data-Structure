package Heap;

public class MaxHeap {
	int [] arr ;
	int last;
	int size;
	
	public  MaxHeap (int size) {
		this.size=size;
		arr = new int [size];
		last =-1;
	}
    public boolean Add (int data) {
    	if (last == size -1) return false;     // if the arr is full
    	arr [++ last] = data;
    	Heapify_Up(last);
    	return true;
    }
	private void Heapify_Up(int pos) {
		if(pos == 0) return;    //  if the location is 0 that say that we finish
		int parent = (int)(Math.floor((pos-1)/2));
		if (arr[pos]> arr[parent]) {    // if the son big from the father
			swap(arr,pos,parent);
			 Heapify_Up(parent);
		}
	}
	private void swap(int[] arr, int from, int to) {
	int tmp = arr[from];
	arr[from ] = arr[to];
	arr[to] =tmp;
	}
	public int Delete () {
		int tmp = arr[0];    //always we remove the root.
		swap(arr,0,last--);
		Heapify_dwon(0);
		return tmp;
	}
	private void Heapify_dwon(int pos) {
		int left , right;
		left = 2*pos +1 ;   // thats the location of the children
		right =2*pos +2 ;
		if((left == last) && (arr[pos] < arr[left]) ){
			swap(arr,pos,left);
			return;
		}
		if ( right == last && arr[pos]<arr[right]) {
			swap(arr,last,right);
			return;
		}
		if(left >= last || right >= last) {
			return;
		}
		if (arr[left]>arr[right]&& arr[pos]<arr[left]) {
			swap(arr,pos,left);
			Heapify_dwon(left);
		}else if(arr[pos]<arr[right]) {
			swap (arr,pos,right);
			Heapify_dwon(right);
		}
	}
	public static void HeadSort (int arr[]) {      
		MaxHeap h = new MaxHeap (arr.length);   // we are bulding the heap
		for (int i = 0; i < arr.length; i++) {   // we are adding the value of the arr into the heap
			h.Add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {    // when we deleted the value in the heap we are sorting the arr
			h.Delete();
		}
		for (int i = 0; i < arr.length; i++) {   // copy back the sorting arr.
			arr[i] = h.arr[i];
		}
	}
}
