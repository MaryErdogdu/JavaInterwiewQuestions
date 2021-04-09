package ArrayInterwiew;

public class PairsValue {
	
	//Write a Java program to find all pairs of 
	//elements in an array whose sum is equal to a specified number

	public static void main(String[] args) {
		
		
		int array[] ={1,2,3,4,5,6,7,8,9};
		
		paris_value(array, 7);
		
		
	}
	
	public static void paris_value(int array [] , int sayi) {
		
		System.out.println("Pairs of elements and their sum : ");
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if(array[i]+array[j]== sayi) {
					
					System.out.println(array[i]+ " + " + array[j]+ " = " + sayi);
				}
				
			}
		}
		
	}

}
