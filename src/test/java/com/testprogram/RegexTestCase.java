package com.testprogram;

import org.junit.Assert;
import org.junit.Test;

import com.program.RegexProgram;

public class RegexTestCase {



	@Test
	public void emailIdTest1() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc@yahoo.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest2() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc.100@yahoo.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest3() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc111@abc.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest4() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc-100@abc.net";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest5() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc.100@abc.com.au";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest6() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc@1.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}

	@Test
	public void emailIdTest7() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc@gmail.com.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}@Test
	public void emailIdTest8() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc+100@gmail.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}@Test
	public void emailIdTest9() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest10() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc@.com.my";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest11() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc123@gmail.a";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest12() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="Password@12345";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest13() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc123@.com.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest14() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user=".abc@abc.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest15() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc()*@gmail.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}

	@Test
	public void emailIdTest16() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc@%*.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest17() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc..2002@gmail.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest18() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc.@gmail.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest19() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc@abc@gmail.com";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest20() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc@gmail.com.1a";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}
	@Test
	public void emailIdTest21() {
		RegexProgram obj=new RegexProgram();
		String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
		String user="abc@gmail.com.aa.au";
		Assert.assertEquals(true, obj.regexRunner(regex, user));
	}

}