package com.Bootcamp_mediumpart1utilities;

import java.util.Date;

public class utilitie {
	
	public static String dateStampEmail(){
		Date date = new Date();
		System.out.println(date);
		String emailDate = date.toString().replace (" ","_").replace(":","_");
		System.out.println(emailDate);
		return"benamroucheamina"+ emailDate +"@gmail.com";
}
	
	
	public static final int implicit_wait = 10;
	public static final int pageLoad = 10;
	public static final int script = 10;
	
	
}
