package lsp.refractor;

public class Square extends Polygon {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int calculateArea() {
		int area=side*side;
		return area;
	}

}
