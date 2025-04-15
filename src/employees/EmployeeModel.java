
package employees;

public sealed abstract class EmployeeModel permits Manager, Saleman{
	protected String name;
	protected String address;
	protected String code;
	protected String age;
	protected double salary;

	//Constructor
	public EmployeeModel(String name,
					String address,
					String code,
					String age,
					double salary) {
		this.name = name;
		this.address = address;
		this.code = code;
		this.age = age;
		this.salary = salary;
	}

	public EmployeeModel() {} //Empty constructor
	
	//Getters
	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public String getCode() {
		return code;
	}


	public String getAge() {
		return age;
	}


	public double getSalary() {
		return salary;
	}

	public abstract void getFullSalary();

}
