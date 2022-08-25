package string_assignment1_generatepassword;

import java.util.Scanner;

public class StringUtilTest {

	public static void main(String[] args) {
		//taking user input
		System.out.println("Please Enter Your First Name, Last Name and Year of Birth: Example String: Pankaj Sharma 1983");
		Scanner scn = new Scanner(System.in);
		String inputString = scn.nextLine().toLowerCase();

		
		String [] inputStringParts = inputString .split(" ");
		String firstName = inputStringParts[0];
		String lastName = inputStringParts[1];
		String YearOfBirth = inputStringParts[2];

		StringUtil newStringUtil = new StringUtil();
		
		String generatedPassword =  newStringUtil.generatedPassword(firstName, lastName, YearOfBirth);
		System.out.println("Generated Password : " + generatedPassword );
	}

}
