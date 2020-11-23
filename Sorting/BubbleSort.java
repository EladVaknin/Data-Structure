package Sorting;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = {1,2,5,6,7,2,3,8,10,13,25,0,5,32};

         for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {

                if(numbers[i] > numbers[j]) {
                    int temp = numbers[i];                 // swap
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

	}

}
