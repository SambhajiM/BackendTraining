package arr_assignment1_min_max;

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
		ArrayMinMax newMinMax = new ArrayMinMax();
		
		//calling getMinMax function by passing argument array and size of array
		int [] minMax = newMinMax.getMinMax(arr, sizeOfArray);
		System.out.println("min = " + minMax[0] + "," + " max = " + minMax[1]);
		
	}
}
