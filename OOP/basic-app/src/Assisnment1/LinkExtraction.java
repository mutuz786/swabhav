package Assisnment1;

public class LinkExtraction {
	public static void main(String[] args)
	{
		String link="http://www.swabhavtechlabs.com?developer=murtaza&role=designer";
		String company,developer,role;
		char ch[]= {'?','&','.','/',':','='};
		for(int i=0;i<ch.length;i++)
		{	
			link=link.replace(ch[i], ' ');
		}
		String[] words=link.split("\\s");
		
		company=getcompany(words);
		developer=getdeveloper(words);
		role=getrole(words);
		
		System.out.println("Company:"+company);
		System.out.println("Developer:"+developer);
		System.out.println("Role:"+role);
	}
	
	private static String getcompany(String[] w)
	{
		for(int index=0;index<w.length;index++)
		{
			if(w[index].equals("www"))
				return w[index+1];
			
		}
		return null;
	}
	
	private static String getdeveloper(String[] w)
	{
		for(int index=0;index<w.length;index++)
		{
			if(w[index].equals("developer"))
				return w[index+1];
			
		}
		return null;
	}
	
	private static String getrole(String[] w)
	{
		for(int index=0;index<w.length;index++)
		{
			if(w[index].equals("role"))
				return w[index+1];
		}
		return null;
	}
}