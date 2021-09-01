
package com.bridgelabs.registrationtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabs.registrationregex.Registration;

@RunWith(Parameterized.class)
public class RegistratrationRunner {
	private String email;

	public RegistratrationRunner(String email) {
		this.email = email;
	}

	@Parameterized.Parameters
	public static Collection UserRegistration() {
		Object[][] input = { { "abc.xyz@bl.co.in" }, { "Priteshraj.abc@gmail.com.in" }, { "pinakindia@gmail.com.in" } ,{"abc-100@abc.net"}};

		return Arrays.asList(input);
	}

	@Test
	public void testEmailId() {
		Registration registration = new Registration();
		Assert.assertEquals(true, registration.valid_EmailId(email));
	}
}
