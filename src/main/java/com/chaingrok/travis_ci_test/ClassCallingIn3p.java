package com.chaingrok.travis_ci_test;

import com.chaingrok.pack3p.ClassIn3p;

public class ClassCallingIn3p {
	
	public boolean calling3p() {
		ClassIn3p in3p = new ClassIn3p();
		return in3p.returnTrue();
	}

}
