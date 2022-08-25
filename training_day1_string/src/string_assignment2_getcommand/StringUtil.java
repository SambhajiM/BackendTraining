package string_assignment2_getcommand;

import java.net.URL;

public class StringUtil {
	
	//getCommand method for getting command string from url
		public String getCommand(String url){
			String command = "";
			try{
				URL ural = new URL(url);
				command = ural.getFile();
			}catch(Exception e){
				System.out.println(e);
			}
			return command;
		}
}
