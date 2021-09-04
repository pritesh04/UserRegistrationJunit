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
		System.out.println("Validation for First Name is : " + firstName.validate("Pritesh"));
		System.out.println("Validation for First Name is : " + firstName.validate("pritesh"));
		System.out.println("Validation for First Name is : " + firstName.validate("Pr223itesh"));

		IRegistration lastName = (name) -> {
			String Uc1 = "^[A-Z][a-zA-z]{2,}";
			if (name.matches(Uc1)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for Last Name is : " + lastName.validate("Bhangale"));
		System.out.println("Validation for Last Name is : " + lastName.validate("bhangale"));
		System.out.println("Validation for Last Name is : " + lastName.validate("b665hangale"));

		IRegistration emailId = (name) -> {
			String emailRegex = "^[a-zA-Z]{2,}?[.+-]?[0-9a-zA-Z]{1,}@[a-z]{2,}.[a-z]{2,3}?[.]?[a-z]{1,}";
			if (name.matches(emailRegex)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for Email is : " + emailId.validate("Prites22h@gmail.com"));
		System.out.println("Validation for Email is : " + emailId.validate("Prites.bh@gmail.com"));
		System.out.println("Validation for Email is : " + emailId.validate("Prites.bh@gmail.com.co"));
		System.out.println("Validation for Email is : " + emailId.validate("Prites22h@gmail.com.co.in"));

		IRegistration passWord = (name) -> {
			String passwordRegex = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&]).*$";
			if (name.matches(passwordRegex)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for password is : " + emailId.validate("Priteshhhh123#"));
		System.out.println("Validation for password is : " + emailId.validate("priteshhhh"));
		System.out.println("Validation for password is : " + emailId.validate("pritesh22hhh123#"));
		System.out.println("Validation for password is : " + emailId.validate("Pritesh33h123#"));
		IRegistration mobileNo = (name) -> {
			String mobileRegex = "^[91]{2}\s[0-9]{10}";
			if (name.matches(mobileRegex)) {
				return true;
			}
			return false;
		};
		System.out.println("Validation for MobileNo is : " + mobileNo.validate("91 8928877307"));
		System.out.println("Validation for MobileNo is : " + mobileNo.validate("925558928877307"));
		System.out.println("Validation for MobileNo is : " + mobileNo.validate("918abs28877307"));

	}
}
