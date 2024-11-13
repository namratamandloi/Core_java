package in.co.Encapsulationusingconstructor;

public class Employee1 {
	private String name;


	public Employee1(String name) {
		this.name = name;
	}

	public Employee1() {
		System.out.println("default constructor");
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Employee1 e = new Employee1("Namrata");
		System.out.println(e.getName());

	}

}
