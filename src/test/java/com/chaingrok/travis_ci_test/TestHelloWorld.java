package com.chaingrok.travis_ci_test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHelloWorld {
	
	@Test
	public void testHelloWorld() {
		HelloWorld hw = new HelloWorld();
		assertTrue(hw.print());
	}

}
