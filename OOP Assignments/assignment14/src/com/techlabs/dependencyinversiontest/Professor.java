package com.techlabs.dependencyinversiontest;

public class Professor {
	private PersonalData personalData;
	private String subject;

	public Professor(PersonalData personalData, String subject) {
		this.personalData = personalData;
		this.subject = subject;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public String getSubject() {
		return subject;
	}

}
