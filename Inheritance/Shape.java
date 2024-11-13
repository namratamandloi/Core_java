package in.co.Inheritance;

public class Shape {
	private String color;
	private int borderwidth;

	public Shape(String color, int borderwidth) {
		this.color = color;
		this.borderwidth = borderwidth;
	}

	public String getColor() {
		return color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public double area() {
		return 0;
	}

}
