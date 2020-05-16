package com.techlabs.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Organisation {
	private UUID id;
	private String name;
	private Date registrationDate;
	private List<Partner> partners = new ArrayList<Partner>();
	private List<Talent> talents = new ArrayList<Talent>();

	public Organisation(String name, String registrationDate) throws ParseException {
		this.id = UUID.randomUUID();
		this.name = name;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		this.registrationDate = formatter.parse(registrationDate);
	}

	public void addTalent(Talent talent) {
		if (talent.getPartner() != null)
			talent.getPartner().addTalent(talent);
		talents.add(talent);
	}

	public void addPartner(Partner partner) {
		partners.add(partner);
	}

	public int getTalentsCount() {
		return talents.size();
	}

	public int getPartnersCount() {
		return partners.size();
	}

	public Iterable<Talent> getTalents() {
		return talents;
	}

	public Iterable<Partner> getPartners() {
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
