package com.bridgelabs.registrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabs.registrationregex.Registration;

public class RegistrationTest {
	@Test
	public void test() {
		Registration re = new Registration();
		Assert.assertEquals(true, re.valid_FirstName("Pritesh"));
	}
	
	
}
