package in.co.Encapsulationusingconstructor;

public class Employee {
	private String name;
	private int salary;
	private int id;

	public Employee(String name, int salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		Employee e = new Employee("Ram", 1234, 15000);
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getId());

	}

}
