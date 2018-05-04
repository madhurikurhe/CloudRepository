package isp.refractor;

public interface IWorker extends IWork,IEat {
	public void startEat();
	public void stopEat();
	public void startWork();
	public void stopWork();
	
}
