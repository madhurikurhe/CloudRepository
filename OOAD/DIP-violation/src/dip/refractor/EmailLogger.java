package dip.refractor;

public class EmailLogger implements ILogger {

	@Override
	public void log(String errmsg) {

		System.out.println("Log Emailed");
		System.out.println(errmsg);
		
	}

}
