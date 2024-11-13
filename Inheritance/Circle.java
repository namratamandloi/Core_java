package in.co.Inheritance;

public class Circle extends Shape {
	private double radius;

	public Circle(String color, int borderwidth, double radius) {
		super(color, borderwidth);
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
