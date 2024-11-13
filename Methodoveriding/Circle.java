package in.co.Methodoveriding;

public class Circle extends Shape {
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
