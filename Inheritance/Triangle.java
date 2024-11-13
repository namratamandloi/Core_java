package in.co.Inheritance;

public class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle(String color, int borderwidth, double base, double height) {
		super(color, borderwidth);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public void setBase() {
		this.base = base;
	}

	public double area() {
		return 0.5 * base * height;
	}
}
