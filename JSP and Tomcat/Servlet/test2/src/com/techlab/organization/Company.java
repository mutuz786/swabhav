package com.techlab.organization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Company {

	private UUID id;
	private String name;
	private Date registrationDate;
	private List<PartnerCompany> partners = new ArrayList<PartnerCompany>();
	private List<Fresher> freshers = new ArrayList<Fresher>();

	public Company(String name, String registrationDate) {
		this.id = UUID.randomUUID();
		this.name = name;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			this.registrationDate = formatter.parse(registrationDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void addFresher(Fresher fresher) {
		fresher.getPartner().addFresher(fresher);
		freshers.add(fresher);
	}

	public void addPartner(PartnerCompany partner) {
		partners.add(partner);
	}

	public int getFresherCount() {
		return freshers.size();
	}

	public int getPartnersCount() {
		return partners.size();
	}

	public Iterable<Fresher> getFreshers() {
		return freshers;
	}

	public Iterable<PartnerCompany> getPartners() {
		return partners;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

}
