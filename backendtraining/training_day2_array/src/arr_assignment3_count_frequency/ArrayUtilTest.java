package arr_assignment3_count_frequency;

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
		
		CountFrequency newCountFrequency = new CountFrequency();
		newCountFrequency.countFrequency(arr, sizeOfArray);
		
	}
}
