package com.techlabs.model.test;

import java.text.ParseException;
import java.util.UUID;

import com.techlabs.model.*;

public class Program {
	public static void main(String[] args) throws ParseException {
		Organisation swabhav = new Organisation("swabhavtechlabs", "12-June-1997");
		Partner aurionPro = new Partner("Aurionpro", 6725372.23, 453);
		Partner google = new Partner("google", 652523.72, 5423);
		Partner microsoft = new Partner("microsoft", 653253.12, 5421);
		Talent murtaza = new Talent("murtaza", 7.4, aurionPro, "java");
		Talent rahul = new Talent("rahul", 8.1, aurionPro, "c++");
		swabhav.addPartner(aurionPro);
		swabhav.addPartner(google);
		swabhav.addPartner(microsoft);
		swabhav.addTalent(murtaza);
		swabhav.addTalent(rahul);
		//printInfo(swabhav);
		//printInfo(aurionPro);
		//printInfo(google);
		System.out.println(UUID.fromString("murtaza".toString()));
	}

	private static void printInfo(Partner partner) {
		System.out.println("id:" + partner.getId() + "\nname:" + partner.getName() + "\ncompany turnover:"
				+ partner.getCompanyTurnOver() + "\nemployee strength" + partner.getEmployeeStrength()
				+ "\ntalent count:" + partner.getTalentsCount() + "\ntalent:");
		for (Talent talent : partner.getTalents()) {
			System.out.println(talent.getName());
		}

	}

	private static void printInfo(Organisation organisation) {
		System.out.println("id:" + organisation.getId() + "\nname:" + organisation.getName() + "\nregistration date:"
				+ organisation.getRegistrationDate() + "\npartners count:" + organisation.getPartnersCount()
				+ "\npartners:\n");
		for (Partner partner : organisation.getPartners()) {
			printInfo(partner);
		}
	}
}
