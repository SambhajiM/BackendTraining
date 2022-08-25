package string_assignment1_generatepassword;

public class StringUtil {
	public String generatedPassword(String firstName, String lastName, String yob){
		return firstName.substring(1,4) + lastName.substring(1,4) + yob.substring(2);
	}
}
