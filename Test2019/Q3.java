package Test2019;

public class Q3 {
  
	public static void main(String[] args) {
		int arr [] =  {4,6,1,-10,-3,6,-2};
		int Max =0;
		int Max2=0;
		int Min , Min2 ;
		Min = Min2=0;
		int sum1 , sum2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>Max) {
				Max = arr[i];
			}if(arr[i] < Max ) {
				Max2 = arr[i];
			}if(arr[i]<Min) {
				Min = arr[i];
			}if (arr[i] <Min2 &&arr[i] != Min) {
				Min2 = arr[i];
			}
		}
			sum1 = Max * Max2;
			sum2 = Min * Min2;
		    if (sum1 == sum2) {
		    	System.out.println(sum1 + " " + sum2);
		    }else if(sum1<sum2) {
		    	System.out.println(sum2);
		    }else if (sum1>sum2) {
		    	System.out.println(sum1);
		    }
		    	

	}

}
