package com.bridgelabs.registrationregex;

public class MoodAnalyser {
	String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("Happy"))
			return "Happy";
		else if (message.toLowerCase().contains("sad"))
			return "SAD";
		else
			return "Happy";
	}

	public String analyseMood(String mood) throws MoodAnalyserException {
		try {
			if(mood.length()<=0)
			{
				throw new MoodAnalyserException("Message cant be empty");
			}
			if (mood.contains("Happy"))
				return "Happy";
			
			else if (mood.toLowerCase().contains("sad"))
				return "SAD";

			else
				return "Happy";
		} catch (NullPointerException e) {
			// return "Exception Handled";
			throw new MoodAnalyserException("Mood cannot be Null Please give messgage");
		}

	}
}
