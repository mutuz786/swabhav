package dip.solution1;

public class JSONLogger implements ILog {
	public void log(String errorMessage) {
		System.out.println("writing data in JSON file...\n" + errorMessage);
	}
}
