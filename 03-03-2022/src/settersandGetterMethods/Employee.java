package settersandGetterMethods;

public class Employee {
	

	int id;
	String name;
	double salary;
	
	public Employee() 
	{
		
	}
	
	//setters and getters method	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		//set values to the object using setter methods
		employee.setId(1202);
		employee.setName("Amma");
		employee.setSalary(89904.45);
		
		//print values on the screen using getter methods
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());	
		
	}
}



