package com.techlab.model;

public class AccountStatus {
	private static boolean status = false;

	public static boolean isAdmin() {
		return status;
	}

	public static void startSession() {
		status = true;
	}

	public static void endSession() {
		status = false;
	}
}
