package com.program;

import java.util.regex.Pattern;

public class RegexProgram {

	public boolean regexRunner(String regexExpression,String userIP) {
		boolean valid=Pattern.compile(regexExpression).matcher(userIP).matches();
		return valid;
	}

}