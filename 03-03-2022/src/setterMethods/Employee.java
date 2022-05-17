package setterMethods;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee()
	{
		
	}
	//SetterMethods
	public void setId(int id)
	{
		this.id = id;
		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDouble(Double salary)
	{
		this.salary = salary;
		
	}
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {  

		Employee employee = new Employee();
		
		//setting values using setter methods
		employee.setId(4550);
		employee.setName("Sree");
		employee.setDouble(89058.45);
		
		employee.getEmployeeInfo();
	

}
}
