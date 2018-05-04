package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class ISPTest {
	public static void main(String[] args) {
		atCafeteria(new Manager());
		atCafeteria(new Robot());
		atWorkstation(new Manager());
		atWorkstation(new Robot());

	}

	public static void atCafeteria(IWorker w) {
		System.out.println("At cafeteria");
		w.startEat();
		w.stopEat();
	}

	public static void atWorkstation(IWorker w) {
		System.out.println("At Workstation");
		w.startWork();
		w.stopWork();
	}
}
