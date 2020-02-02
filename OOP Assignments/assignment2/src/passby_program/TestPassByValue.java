package passby_program;

public class TestPassByValue {
	public static void main(String[] args) {
		Student stud1 = new Student("Murtaza");
		Student stud2 = new Student("Pawan");
		Student stud3 = new Student("Jay");

		System.out.print("Stud1:" + stud1.getName());
		System.out.print("\tStud2:" + stud2.getName());
		System.out.println("\tStud3:" + stud3.getName());

		swap(stud2, stud3);
		System.out.print("Stud1:" + stud1.getName());
		System.out.print("\tStud2:" + stud2.getName());
		System.out.println("\tStud3:" + stud3.getName());

		changeObject(stud3);
		System.out.print("Stud1:" + stud1.getName());
		System.out.print("\tStud2:" + stud2.getName());
		System.out.println("\tStud3:" + stud3.getName());

		Student temp = stud2;
		stud2 = stud3;
		stud3 = temp;
		System.out.print("Stud1:" + stud1.getName());
		System.out.print("\tStud2:" + stud2.getName());
		System.out.println("\tStud3:" + stud3.getName());

		stud1 = newObject();
		System.out.print("Stud1:" + stud1.getName());
		System.out.print("\tStud2:" + stud2.getName());
		System.out.println("\tStud3:" + stud3.getName());

	}

	private static Student newObject() {
		Student stud = new Student("Prasad");
		return stud;
	}

	private static void changeObject(Student stud3) {
		stud3.setName("Tanmay");
	}

	private static void swap(Object stud2, Object stud3) {
		Object temp = stud2;
		stud2 = stud3;
		stud3 = temp;
	}
}

class Student {
	private String name;

	public Student() {

	}

	public Student(String arg) {
		this.name = arg;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String arg) {
		this.name = arg;
	}
}