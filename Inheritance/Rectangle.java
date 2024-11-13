package in.co.Inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public Rectangle(String color, int borderwidth, int length, int width) {
		super(color, borderwidth);
		this.length = length;
		this.width = width;

	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public double area() {
		return length * width;
	}

}
