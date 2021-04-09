package JavaInterwiew;

import java.util.Arrays;

public class FindLArgerSmallerNumber {

	public static void main(String[] args) {
		
		int []arr = {7,2,3,4,56,57,5,8,9};
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		
		int smallest=arr[0];  //[2]
		
		int largest = arr[0];

    for (int i = 1; i < arr.length; i++) {
    	if (arr[i]>largest) {
			largest=arr[i];
		}else if(arr[i]<smallest) {
			smallest=arr[i];
		}
    }
    	System.out.println("large = " + largest);
    	
    	System.out.println("smallest = " + smallest );
		
	
		
		
	}

}
