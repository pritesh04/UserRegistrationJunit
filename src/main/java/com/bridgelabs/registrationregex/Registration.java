package com.bridgelabs.registrationregex;

public class Registration {
	public boolean valid_FirstName(String name) throws MoodAnalyserException {
		String Uc1 = "^[A-Z][a-zA-z]{2,}";
		try {
			if (name.length() <= 0) {
				throw new MoodAnalyserException("FirstName cant be blank");
			}
			if (name.matches(Uc1)) {
				return true;
			}
			return false;
		} catch (NullPointerException e) {
			throw new MoodAnalyserException("FirstName cant be null");

		}
	}

	public boolean valid_LastName(String name) throws MoodAnalyserException {
		String Uc1 = "^[A-Z][a-zA-z]{2,}";
		try {
			if (name.length() <= 0) {
				throw new MoodAnalyserException("LastName cant be blank");
			}
			if (name.matches(Uc1)) {
				return true;
			}
			return false;
		} catch (NullPointerException e) {
			throw new MoodAnalyserException("LastName cant be null");

		}
	}

	public Boolean valid_EmailId(String email) throws MoodAnalyserException {
		String Uc3 = "^[a-zA-Z]{2,}?[.+-]?[0-9a-zA-Z]{1,}@[a-z]{2,}.[a-z]{2,3}?[.]?[a-z]{1,}";
		try {
			if (email.length() <= 0) {
				throw new MoodAnalyserException("Email cant be blank");
			}
			if (email.matches(Uc3)) {
				return true;
			}
			return false;
		} catch (NullPointerException e) {
			throw new MoodAnalyserException("Email cant be null");

		}
	}

	public Boolean valid_MobileNumber(String mobNo) throws MoodAnalyserException {
		String Uc4 = "^[91]{2}\s[0-9]{10}";
		try {
			if (mobNo.length() <= 0) {
				throw new MoodAnalyserException("Mobile Number cant be blank");
			}
			if (mobNo.matches(Uc4)) {
				return true;
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyserException("Mobile Number cant be null");

		}

		return false;
	}

	public Boolean valid_PasswordWith8Characters(String password) throws MoodAnalyserException {

		String Uc5 = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&]).*$";

		try {
			if (password.length() <= 0) {
				throw new MoodAnalyserException("Password cant be blank");
			}
			if (password.matches(Uc5)) {
				return true;
			}
			return false;
		} catch (NullPointerException e) {
			throw new MoodAnalyserException("Password cant be null");

		}
	}
}
