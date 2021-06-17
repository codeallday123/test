package testcom.aspect;

public class Customer {

	private final String name;
	private final int age;

	public Customer(final String name, final int age) {
		this.name = name;
		this.age = age;
	}

	/** javadoc */
	public String getName() {
		System.out.println("Inside method getName(), Name is: " + name);
		return name;
	}

	/** javadoc */
	public int getAge() {
		return age;
	}
}
