package com.program;

import java.util.regex.Pattern;

public class RegexProgram {

	public boolean regexRunner(String regexExpression,String userIP)  throws InvalidNameException {
		boolean valid=Pattern.compile(regexExpression).matcher(userIP).matches();
		if (valid==false) {
			throw new InvalidNameException("Plese Enter Corrected Format");			
		}
		else 
		return valid;
	}

}