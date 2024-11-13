package in.co.Methodoveriding;

public class Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setLength(2);
		r.setWidth(3);
		Circle c = new Circle();
		c.setRadius(4);
		Triangle t = new Triangle();
		t.setBase(5);
		t.setHeight(8);

		System.out.println("Area of Rectangle is: " + r.area());
		System.out.println("Area of Circle is: " + c.area());
		System.out.println("Area of Triangle: " + t.area());

	}

}
