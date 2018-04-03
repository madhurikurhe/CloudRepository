package man;

public class Boy extends Man {	
	public void eat(){
		System.out.println("Man is eating");
	}
	
	@Override
	public void play(){
	//	super.play();
		System.out.println("Boy is playing");
	}
}
