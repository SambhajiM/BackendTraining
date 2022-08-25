package arr_assignment2_reverse_string;

public class ReverseString {
	
	public String getReverseString(String givenString){

		String reverseString = "";
		for(int i=0; i<givenString.length(); i++){
			char ch = givenString.charAt(i);
			reverseString = ch+reverseString;
		}
		return reverseString;
	}
}
