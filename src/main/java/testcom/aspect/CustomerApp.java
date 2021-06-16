package testcom.aspect;

public class CustomerApp {

	public static void main(String[] args) {
		final Customer c1 = new Customer("John", 44);
		final Customer c2 = new Customer("Bob", 33);
		c1.getName();
		c2.getName();

	}

}
