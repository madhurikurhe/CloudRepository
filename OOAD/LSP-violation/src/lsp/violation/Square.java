package lsp.violation;

public class Square extends Rectangle{

	public Square(int height, int width) {
		super(height, width);
	}
	
	@Override
	public void setHeight(int height) {
		this.height=this.width=height;
	}
	
	@Override
	public void setWidth(int width) {
		this.height=this.width=width;
	}
	
	

}
