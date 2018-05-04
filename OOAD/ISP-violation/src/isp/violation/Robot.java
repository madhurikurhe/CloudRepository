package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot is Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stopped Working");
	}

	@Override
	public void startEat() {
		
	}

	@Override
	public void stopEat() {
		
	}

}
