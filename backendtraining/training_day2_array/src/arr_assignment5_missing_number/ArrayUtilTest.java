package arr_assignment5_missing_number;

import java.util.Scanner;

public class ArrayUtilTest {
	
	public static void main(String [] args){

		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter Range");
		int range = scn.nextInt();
		int [] arr = new int[range - 1];
		System.out.println(" Please Enter " + (range - 1) + "Element of Array");
		for(int i=0; i< range - 1; i++){
			arr[i] = scn.nextInt();
		}
		
		MissingNumber newPostNegArr = new MissingNumber();
		System.out.println("Missing number : " + newPostNegArr.findMissingNumber(arr, range));
		
	}
}
