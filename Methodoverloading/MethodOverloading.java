package in.co.Methodoverloading;

public class MethodOverloading {
	public void say() {
		System.out.println("Hello");
	}

	public void say(int a) {
		System.out.println("argument");
	}

	// public static void say(int a, int b) {
	// System.out.println("sum: " + (a + b));
	// }

	public int say(int a, int b) {
		int c = a + b;
		System.out.println("sum is:" + (c));
		return c;
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.say();
		m.say(20);
		m.say(30, 40);
	}

}
