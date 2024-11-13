package in.co.Inheritance;

public class Test1 {
	public static void main(String[] args) {

		Rectangle r = new Rectangle("Red", 5, 2, 3);
		Circle c = new Circle("Blue", 6, 2);
		Triangle t = new Triangle("Black", 4, 2.2, 2.2);

		System.out.println("Rectangle color: " + r.getColor());
		System.out.println("Rectangle area: " + r.area());

		System.out.println("Triangle color: " + t.getColor());
		System.out.println("Triangle area: " + t.area());

		System.out.println("Circle color: " + c.getColor());
		System.out.println("Circle area: " + c.area());
	}

}
