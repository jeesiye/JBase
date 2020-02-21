package siye.java.text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class xSimpleDateFormat {
	
	
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		System.out.println(simpleDateFormat.toPattern());
		System.out.println(simpleDateFormat.format(new Date()));
	}

}
