package dip.solution1;

public class XMLLogger implements ILog {
	public void log(String errorMessage) {
		System.out.println("writing data in XML file...\n" + errorMessage);
	}

}
