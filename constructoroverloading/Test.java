package in.co.constructoroverloading;

public class Test {
	public Test() {
		System.out.println("I am default constructor");
	}

	public Test(int a) {
		this();
		System.out.println("I am one parameterized constructor");
	}

	public Test(int a, int b) {
		this(a);
		System.out.println("I am second parameterized constructor");
	}

	public Test(int a, int b, int c) {
		this(a, b);
		System.out.println("I am third parameterized constructor");
	}

	public Test(int a, int b, int c, int d) {
		this(a, b, c);
		System.out.println("I am fourth parameterized");
	}

	public static void main(String[] args) {

		Test t = new Test(1, 2, 3);

	}

}
