package com.tcsjava8Assignment;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearJoined;
	private double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearJoined, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearJoined = yearJoined;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearJoined=" + yearJoined + ", salary=" + salary + "]";
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearJoined() {
		return yearJoined;
	}

	public void setYearJoined(int yearJoined) {
		this.yearJoined = yearJoined;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
