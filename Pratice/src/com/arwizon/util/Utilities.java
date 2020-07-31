package com.arwizon.util;

import com.arwizon.Exception.MyException;

public class Utilities {

	public static void validateName(String name) throws MyException {
		if (!name.matches("[A-Za-z]+"))
			throw new MyException("name only in alphabates");
		
	}

	public static void urlValidation(String url) throws MyException

	{
		if (!url.matches("[a-z://]{3,}[a-z]{3,}(.com|.in)")) 

			throw new MyException("Invalid Url");
		
	}

}
