package in.co.Methodoveriding;

public class Rectangle extends Shape {
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
