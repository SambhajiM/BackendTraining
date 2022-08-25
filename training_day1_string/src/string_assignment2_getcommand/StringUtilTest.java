package string_assignment2_getcommand;

import java.util.Scanner;

public class StringUtilTest {
	public static void main(String [] args){
			
		//taking user input
		System.out.println("Please Enter Your URL");
		Scanner scn = new Scanner(System.in);
		String inputString = scn.nextLine();//https://www.javastring.com/java-tutorial
	
		StringUtil newStringUtil = new StringUtil();
		
		String command =  newStringUtil.getCommand(inputString );
		System.out.println("Generated Command : " + command );
	}
}
