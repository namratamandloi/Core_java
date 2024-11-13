package in.co.Encapsulationusingconstructor;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public static void main(String[] args) {
		Person p = new Person("Namrata",24);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
