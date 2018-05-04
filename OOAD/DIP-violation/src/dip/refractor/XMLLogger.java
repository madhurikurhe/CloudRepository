package dip.refractor;

public class XMLLogger implements ILogger {

	@Override
	public void log(String errmsg) {
		System.out.println("Added to XML file");
		System.out.println(errmsg);

	}

}
