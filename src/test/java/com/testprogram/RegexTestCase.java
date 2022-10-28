package com.testprogram;

import org.junit.Assert;
import org.junit.Test;

import com.program.RegexProgram;

public class RegexTestCase {
	@Test
	   public void firstNameTest() {
		   RegexProgram obj=new RegexProgram();
		   String regex="^[A-Z]+[a-z]{2,}";
		   String user="Ashu";
		   Assert.assertEquals(true, obj.regexRunner(regex, user));
	   }
		@Test
		   public void lastNameTest() {
			   RegexProgram obj=new RegexProgram();
			   String regex="^[A-Z]{1}[A-Za-z]{2,}";
			   String user="Nawale";
			   Assert.assertEquals(true, obj.regexRunner(regex, user));
		   }
		@Test
		   public void mobileNumberTest() {
			   RegexProgram obj=new RegexProgram();
			   String regex="^[9]{1}[1]{1}[ ]{1}[0-9]{10}$";
			   String user="91 7776042800";
			   Assert.assertEquals(true, obj.regexRunner(regex, user));
		   }
		@Test
		   public void emailIDTest() {
			   RegexProgram obj=new RegexProgram();
			   String regex="^[a-z]{3}[.]?[a-z]?[@#$&]{1}[a-z]{2}[.]{1}[a-z]{2}[.]{1}[a-z]{2}$";
			   String user="abc@bi.co.in";
			   Assert.assertEquals(true, obj.regexRunner(regex, user));
		   }
		public void passwrdTest() {
			   RegexProgram obj=new RegexProgram();
			   String regex="^[A-Z]+[A-Za-z]{7,}[@#$&][1][0-9]+$";
			   String user="Password@12345";
			   Assert.assertEquals(true, obj.regexRunner(regex, user));
		   }
	}