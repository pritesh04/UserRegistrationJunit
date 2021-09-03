package com.bridgelabs.registrationregex;

public class RegistrationUsingLambda {
	public static void main(String[] args) {

		IRegistration firstName = (name) -> {
			String Uc1 = "^[A-Z][a-zA-z]{2,}";
			if (name.matches(Uc1)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for First Name is : " +firstName.validate("Pritesh"));
		
		IRegistration lastName = (name) -> {
			String Uc1 = "^[A-Z][a-zA-z]{2,}";
			if (name.matches(Uc1)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for Last Name is : " +lastName.validate("Bhangale"));
		
		IRegistration emailId = (name) -> {
			String emailRegex = "^[a-zA-Z]{2,}?[.+-]?[0-9a-zA-Z]{1,}@[a-z]{2,}.[a-z]{2,3}?[.]?[a-z]{1,}";
			if (name.matches(emailRegex)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for Email is : " + emailId.validate("Prites22h@gmail.com"));
		
		IRegistration passWord = (name) -> {
			String passwordRegex = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&]).*$";
			if (name.matches(passwordRegex)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for password is : " + emailId.validate("Priteshhhh123#"));
		IRegistration mobileNo = (name) -> {
			String mobileRegex = "^[91]{2}\s[0-9]{10}";
			if (name.matches(mobileRegex)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for MobileNo is : " + mobileNo.validate("91 8928877307"));
		

	}
}
