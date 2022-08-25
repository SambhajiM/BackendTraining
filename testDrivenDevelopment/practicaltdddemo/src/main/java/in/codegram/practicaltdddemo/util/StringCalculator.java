package in.codegram.practicaltdddemo.util;

import java.util.Arrays;

public class StringCalculator {

	public int calculate(String input) {
		try {
			if(input.isEmpty()) {
				return 0;
			}
			else {
				return Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).sum();
			}
		}catch (Exception e) {
			throw new NumberFormatException("Number is not in integere formate");
		}
		
		
		/*
		 * 
		 * public int calculate(String input) {
		try {
			if(input.isEmpty()) {
				return 0;
			}
			else if(input.indexOf(",")!=-1) {
				String [] tokens = input.split(",");
				int sum=0;
				for(String token: tokens) {
					sum+=Integer.parseInt(token);
				}
				return sum;
			}else {
				return Integer.parseInt(input);
			}
		}catch (Exception e) {
			throw new NumberFormatException("Number is not in integere formate");
		}
		 */
		
	}

}
