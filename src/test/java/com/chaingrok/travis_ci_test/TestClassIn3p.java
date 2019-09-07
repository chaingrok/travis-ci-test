package com.chaingrok.travis_ci_test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.chaingrok.pack3p.ClassIn3p;

public class TestClassIn3p {
	
	@Test
	public void testDirect() {
		ClassIn3p in3p = new ClassIn3p();
		assertTrue(in3p.returnTrue());
	}
	
	@Test
	public void testIndirect() {
		ClassCallingIn3p callingIn3p = new ClassCallingIn3p();
		assertTrue(callingIn3p.calling3p());
	}
	

}
