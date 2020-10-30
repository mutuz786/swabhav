package com.techlab.organization.test;

import com.techlab.organization.*;

public class Test {
	public static void main(String[] args) {
		Company swabhav = new Company("swabhavtechlabs", "12-June-1997");
		PartnerCompany aurionPro = new PartnerCompany("Aurionpro", 6725372.23, 453);
		PartnerCompany google = new PartnerCompany("google", 652523.72, 5423);
		PartnerCompany microsoft = new PartnerCompany("microsoft", 653253.12, 5421);
		Fresher murtaza = new Fresher("murtaza", 7.4, aurionPro, "java");
		Fresher rahul = new Fresher("rahul", 8.1, aurionPro, "c++");
		Fresher sagar = new Fresher("sagar", 5.7, google, "jsp");
		swabhav.addPartner(aurionPro);
		swabhav.addPartner(google);
		swabhav.addPartner(microsoft);
		swabhav.addFresher(murtaza);
		swabhav.addFresher(rahul);
		swabhav.addFresher(sagar);
		printInfo(swabhav);
	}

	private static void printInfo(PartnerCompany partner) {
		System.out.println("\nName:" + partner.getName() + "\nEmployee strength" + partner.getEmployeeStrength()
				+ "\nfresher count:" + partner.getFresherCount() + "\nfresher:");
		for (Fresher fresher : partner.getFresher()) {
			printInfo(fresher);
		}

	}

	private static void printInfo(Fresher fresher) {
		System.out.println(
				"Name:" + fresher.getName() + "\tTech:" + fresher.getTechStack() + "\tcgpa:" + fresher.getCgpa());
	}

	private static void printInfo(Company company) {
		System.out.println(
				"name:" + company.getName() + "\npartners count:" + company.getPartnersCount() + "\npartners:\n");
		for (PartnerCompany partner : company.getPartners()) {
			printInfo(partner);
		}
	}

}
