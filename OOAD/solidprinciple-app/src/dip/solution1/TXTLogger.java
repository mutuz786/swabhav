package dip.solution1;

public class TXTLogger implements ILog {
	public void log(String errorMessage) {
		System.out.println("writing data in TXT file...\n" + errorMessage);
	}
}
