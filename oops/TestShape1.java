package in.co.oops;

public class TestShape1 {
	public static void main(String[] args) {
		Shape1 s = new Shape1();
		s.setBorderwidth(10);
		s.setColor("Blue");
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
	}

}
