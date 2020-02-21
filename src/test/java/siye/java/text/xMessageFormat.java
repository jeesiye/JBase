package siye.java.text;

import java.text.MessageFormat;

public class xMessageFormat {

	public static void main(String[] args) {
		
		String result = MessageFormat.format("{0}, {1} - {2}", "a","b","123");
		System.out.println(result);
		

		MessageFormat messageFormat = new MessageFormat("{0} {1} {2}");
		System.out.println(messageFormat.toPattern());
		
		
		
	} 

}
