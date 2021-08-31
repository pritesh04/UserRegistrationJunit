package com.bridgelabs.registrationregex;

public class Registration {
	public boolean valid_FirstName(String name) {
		String Uc1 = "^[A-Z][a-zA-z]{2,}";

		if (name.matches(Uc1)) {
			return true;
		}
		return false;
	}

	public boolean valid_LastName(String name) {
		String Uc1 = "^[A-Z][a-zA-z]{2,}";

		if (name.matches(Uc1)) {
			return true;
		}
		return false;
	}
}
