package Assisnments;

public class UrlExtractionSubstringTest {
	//static String link="http://www.swabhavtechlabs.com";
	static String link="http://www.swabhavtechlabs.com?developer=murtaza";
	//static String link = "http://www.aurionpro.com?developer=murtaza&role=designer";
	private static String company;
	private static String developer;
	private static String role;
	public static void main(String[] args) {
		getData();
		if (company != null)
			System.out.println("Company:" + company);
		if (developer != null)
			System.out.println("Developer:" + developer);
		if (role != null)
			System.out.println("Role:" + role);
	}

	public static void getData() {
		int companyinit = 0, companyend = 0, devinit = 0, devend = 0, roleinit = 0, roleend = 0;
		
		roleinit=link.indexOf("role=");
		if(roleinit>0)
			roleinit+=5;
		if(roleinit>0)
			roleend=link.length();	
		
		devinit=link.indexOf("developer=");
		if(devinit>0)
			devinit+=10;
		if(devinit>0 && roleinit>0) {
			devend=link.indexOf("&");
		}
		else if(devinit>0 && roleinit<=0) {
			devend=link.length();
		}
		
		companyinit=(link.indexOf("www."))+4;
		companyend=link.indexOf(".com");	
		
		if(companyinit>0)
			company=link.substring(companyinit, companyend);
		if(devinit>0)
			developer=link.substring(devinit, devend);
		if(roleinit>0)
			role=link.substring(roleinit, roleend);
	}
}