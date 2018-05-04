package isp.refractor;

public class Manager implements IWorker{

	@Override
	public void startEat() {
		System.out.println("Manager is eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager stopped eating");
	}

	@Override
	public void startWork() {
		System.out.println("Manager is working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stopped working");
	}

}
