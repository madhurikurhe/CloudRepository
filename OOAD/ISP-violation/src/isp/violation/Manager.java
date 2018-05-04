package isp.violation;

public class Manager implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Manager is Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stopped Working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager is eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stopped eating");
	}

}
