package in.co.constructoroverloading;

public class Person {
	public Person() {
		System.out.println("It is a Default Constructor");
	}

	public Person(int a) {
		this();
		System.out.println("I am a first constructor");
	}

	public Person(int a, int b) {
		this(a);
		System.out.println("I am a secons constructor");
	}

	public Person(int a, int b, int c) {
		this(a, b);
		System.out.println("I am a third constructor");
	}

	public Person(int a, int b, int c, int d) {
		this(a, b, c);
		System.out.println("I am a fourth constructor");
	}

	public static void main(String[] args) {

		Person p = new Person(1, 2, 3, 4);
	}

}
