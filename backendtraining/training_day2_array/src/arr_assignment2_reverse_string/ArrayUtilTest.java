package arr_assignment2_reverse_string;

import java.util.Scanner;

public class ArrayUtilTest {

	public static void main(String [] args){

		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter Your String");
		String inputString = scn.nextLine();
		ReverseString reverse = new ReverseString();

		//calling getReverseString method
		String newReverseString =  reverse.getReverseString(inputString); 
		System.out.println("Reversed : " + newReverseString );
		
	}
}
