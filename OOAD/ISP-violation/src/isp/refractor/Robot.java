package isp.refractor;

public class Robot implements IWork {
	@Override
	public void startWork() {
		System.out.println("Robot is working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stopped working");
	}

	

}
