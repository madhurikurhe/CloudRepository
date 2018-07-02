package isp.refractor.test;

import isp.refractor.IWork;
import isp.refractor.IWorker;
import isp.refractor.Manager;
import isp.refractor.Robot;

public class LSPRefractorTest {
	public static void main(String[] args) {
		atCafeteria(new Manager());
		atWorkstation(new Manager());
		atWorkstation(new Robot());
		// atCafeteria(new Robot());
	}

	public static void atWorkstation(IWork w) {
		System.out.println("At Workstation");
		w.startWork();
		w.stopWork();
	}

	public static void atCafeteria(IWorker w) {
		System.out.println("At cafeteria");
		w.startEat();
		w.stopEat();
	}

}
