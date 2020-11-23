package Sorting;
import java.util.Arrays;

public class CountingSort {
	public static void countingSort(int[]a) {
		int min = a[0], max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) min = a[i];
			else if (a[i] > max) max = a[i];
		}
		int range = max - min + 1;
		int []freq = new int[range];
		for (int i = 0; i < a.length; i++) {
			int index = a[i] - min;
			freq[index]++;
		}
		int k = 0;
		for (int i = 0; i < freq.length; i++) {
			for (int j = 0; j < freq[i]; j++) {
				a[k++] = i + min;
			}
		}		
	}
	public static void main(String[] args) {
		int[]a = {2,4,4,8,6,7,3,3,9};
		countingSort(a);
		System.out.println(Arrays.toString(a));
	}
}