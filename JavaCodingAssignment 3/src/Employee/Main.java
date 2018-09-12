package Employee;

public class Main {

	public static void main(String args[]) {

		Address address = new Address("Pune");

		Employee employee = new Employee(1, "Kiran", address);

		System.out.println(employee);
	}
}
