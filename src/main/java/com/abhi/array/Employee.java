package com.abhi.array;

public class Employee {
	int empId;
	String firstName;
	String lastName;
	float sal;

	public Employee() {
	}

	public Employee(int empId, String firstName, String lastName, float sal) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", sal=" + sal
				+ "]";
	}

}
