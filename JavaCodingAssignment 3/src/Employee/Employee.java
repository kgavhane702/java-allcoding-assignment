package Employee;

public final class Employee {

	private final int employeeId;
	private final String employeeName;

	private final Address address;

	public Employee(int employeeId, String employeeName, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "employeeId=" + employeeId + ", employeeName=" + employeeName + ", address=" + address;
	}
	
	

}
