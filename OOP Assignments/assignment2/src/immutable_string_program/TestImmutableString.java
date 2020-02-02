package immutable_string_program;

public class TestImmutableString {
	public static void main(String[] args) {
		String link1="http://www.github/mutuz786/swabhav";
		String link2=link1;
		System.out.println(link1);
		System.out.println(link2);
		System.out.println(link1.hashCode());
		System.out.println(link2.hashCode());
		link1=link2.replaceAll("github", "swabhavtechlabs");
		System.out.println(link1);
		System.out.println(link2);
		System.out.println(link1.hashCode());
		System.out.println(link2.hashCode());
		link2=link1.concat("/repo");
		System.out.println(link1);
		System.out.println(link2);
		System.out.println(link1.hashCode());
		System.out.println(link2.hashCode());
		
	}
}
