package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public abstract class Account {
	private static final int MAX_DEPOSIT = 100000;
	private static final int MIN_DEPOSIT = 0;
	private int accno;
	private String name;
	protected double balance;
	private Date creationDate;
	private Date dateOfBirth;

	public Account(int accno, String name, double balance, String dateOfBirth,String creationDate) throws ParseException {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
		this.dateOfBirth = (Date) dateFormat.parse(dateOfBirth);
		this.creationDate = (Date) dateFormat.parse(creationDate);
	}

	public abstract void withdraw(int ammount);

	protected abstract String getAccountType();

	public void deposit(int amount) {
		if (isValidDeposit(amount)) {
			balance += amount;
			System.out.println("Deposit Successful ");
		}
	}

	private boolean isValidDeposit(int amount) {
		if (amount > MIN_DEPOSIT || amount < MAX_DEPOSIT)
			return true;
		return false;
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int calculateAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateOfBirth);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		LocalDate birthDate = LocalDate.of(year, month, date);
		LocalDate currentDate = LocalDate.now();
		Period diff1 = Period.between(birthDate, currentDate);
		return diff1.getYears();
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public String getType() {
		return getAccountType();
	}
}
