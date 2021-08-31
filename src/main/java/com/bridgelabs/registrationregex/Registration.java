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

	public Boolean valid_EmailId(String email) {
		String Uc3="[a-zA-Z0-9.]{1,}[@][a-z]{2,}[.][a-z]{2,3}[.][a-z]{2,3}";
		
		if(email.matches(Uc3))
		{
			return true;
		}
		return false;
	}

	public Boolean valid_MobileNumber(String mobNo) {
		String Uc4="^[91]{2}\s[0-9]{10}";
		
		if(mobNo.matches(Uc4))
		{
			return true;
		}
		return false;
	}
}
