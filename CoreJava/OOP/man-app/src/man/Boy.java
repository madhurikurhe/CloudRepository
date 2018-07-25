package man;

public class Boy extends Man {	
	public void eat(){
		System.out.println("Boy is eating");
	}
	
	@Override
	public void play(){
	//	super.play();
		System.out.println("Boy is playing");
	}
}
