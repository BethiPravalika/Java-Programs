package com.classConcepts;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public void Employee()
	{
		id=3569;
		name="Pravalika";
		salary=45895.32;
	}
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {  
		
		Employee employee = new Employee();
		employee.getEmployeeInfo();
	}

}
