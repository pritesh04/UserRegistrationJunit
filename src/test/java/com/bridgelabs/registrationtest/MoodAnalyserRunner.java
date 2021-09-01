package com.bridgelabs.registrationtest;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabs.registrationregex.MoodAnalyser;
import com.bridgelabs.registrationregex.MoodAnalyserException;

public class MoodAnalyserRunner {
	@Test
	public void whenHappy_ShouldReturnHappy() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String result = analyser.analyseMood("Happy");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void given_IaminSadMood_ShouldReturnSAD() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String result = analyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", result);
	}

	@Test
	public void given_IaminAnyMood_ShouldReturnHappy() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser();
		String result = analyser.analyseMood("I am in Any Mood");
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void given_IaminSadMood_ShouldReturnSAD_ByCallingConstructor() {
		MoodAnalyser analyser = new MoodAnalyser("I am in Sad Mood");
		String result = analyser.analyseMood();
		Assert.assertEquals("SAD", result);
	}

	@Test
	public void given_IaminAnyMood_ShouldReturnHappy_ByCallingConstructor() {
		MoodAnalyser analyser = new MoodAnalyser("I am in Any Mood");
		String result = analyser.analyseMood();
		Assert.assertEquals("Happy", result);
	}

	@Test
	public void givenNull_ShouldHandleException() throws MoodAnalyserException {
		try {
			MoodAnalyser analyser = new MoodAnalyser();
			String result = analyser.analyseMood(null);
			Assert.assertEquals("Exception Handled", result);
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());
		}
	}

}
