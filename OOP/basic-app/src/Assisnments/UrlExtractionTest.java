package Assisnments;

public class UrlExtractionTest {
	public static void main(String[] args)
	{
		String link=" ";
		//String link="http://www.swabhavtechlabs.com?role=designer&developer=murtaza&";
		//String link="http://www.swabhavtechlabs.com?developer=murtaza";
		//String link="http://www.swabhavtechlabs.com";
		String company,developer,role;
		char character[]= {'?','&','.','/',':','='};
		for(int i=0;i<character.length;i++)
		{	
			link=link.replace(character[i], ' ');
		}
		String[] words=link.split("\\s");
		
		company=getCompany(words);
		if(company!=null)
			System.out.println("Company:"+company);
		developer=getDeveloper(words);
		if(developer!=null)
			System.out.println("Developer:"+developer);
		role=getRole(words);
		if(role!=null)
			System.out.println("Role:"+role);
	}
	
	private static String getCompany(String[] words)
	{
		for(int index=0;index<words.length;index++)
		{
			if(words[index].equals("www"))
				return words[index+1];
			
		}
		return null;
	}
	
	private static String getDeveloper(String[] words)
	{
		for(int index=0;index<words.length;index++)
		{
			if(words[index].equals("developer"))
				return words[index+1];
			
		}
		return null;
	}
	
	private static String getRole(String[] words)
	{
		for(int index=0;index<words.length;index++)
		{
			if(words[index].equals("role"))
				return words[index+1];
		}
		return null;
	}
}