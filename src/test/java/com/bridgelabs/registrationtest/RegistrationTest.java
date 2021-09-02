package com.bridgelabs.registrationtest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabs.registrationregex.MoodAnalyserException;
import com.bridgelabs.registrationregex.Registration;

public class RegistrationTest {
	@Test
	public void test() throws MoodAnalyserException {
		Registration re = new Registration();
		Assert.assertEquals(true, re.valid_FirstName("Pritesh"));
	}

	@Test
	public void toCheck_Valid_FirstName_IfNull() throws MoodAnalyserException {
		try {
			Registration re = new Registration();
			Assert.assertEquals(true, re.valid_FirstName(null));
		} catch (MoodAnalyserException e) {
			e.getMessage();
		}

	}

	@Test
	public void valid_LastName() throws MoodAnalyserException {
		Registration re = new Registration();
		Assert.assertEquals(true, re.valid_LastName("Bhangale"));
	}

	@Test
	public void valid_LastName_IfBlank() throws MoodAnalyserException {
		try {
			Registration re = new Registration();
			Assert.assertEquals(true, re.valid_LastName(""));
		} catch (MoodAnalyserException e) {
			e.getMessage();
		}
	}

	@Test
	public void valid_EmailId() throws MoodAnalyserException {
		Registration re = new Registration();
		Assert.assertEquals(true, re.valid_EmailId("pritesh.212@gmail.co.in"));
	}

	@Test
	public void valid_MobileNumber() throws MoodAnalyserException {
		Registration re = new Registration();
		Assert.assertEquals(true, re.valid_MobileNumber("91 8928877307"));
	}

	@Test
	public void valid_PasswordWith8Characters() throws MoodAnalyserException {
		Registration re = new Registration();
		boolean bool = re.valid_PasswordWith8Characters("pritesh@Bhan123");
		Assert.assertEquals(true, bool);
	}

	@Test
	public void valid_PasswordWith8CharactersIfGiven_Null() throws MoodAnalyserException {
		try {
			Registration re = new Registration();
			boolean bool = re.valid_PasswordWith8Characters(null);
			Assert.assertEquals(true, bool);
		} catch (MoodAnalyserException e) {
			e.getMessage();
		}
	}

}
