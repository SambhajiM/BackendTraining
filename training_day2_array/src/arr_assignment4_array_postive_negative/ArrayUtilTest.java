package arr_assignment4_array_postive_negative;

import java.util.Scanner;

public class ArrayUtilTest {

	public static void main(String [] args){

		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter Size Of Array");
		int sizeOfArray = scn.nextInt();
		int [] arr = new int[sizeOfArray];
		System.out.println(" Please Enter " + sizeOfArray + "Element of Array");
		for(int i=0; i< sizeOfArray; i++){
			arr[i] = scn.nextInt();
		}
		
		ArrayPositiveNegative newPostNegArr = new ArrayPositiveNegative();
		int [] newArray = newPostNegArr.arrangePositiveNegative(arr, sizeOfArray);
		for(int i=0; i<sizeOfArray; i++){
			System.out.print("Output Array : " + newArray[i] + " ");
		}
		
	}
}
