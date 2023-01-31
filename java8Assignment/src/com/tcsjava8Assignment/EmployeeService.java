package com.tcsjava8Assignment;

import java.util.List;

public interface EmployeeService {

	
	// 1. How many female & male employees
	public void totalMaleFemaleEmps(List<Employee> employeeList);
			
	// 2. Print all department names
	public void displayDepartmentNames(List<Employee> employeeList);
			
	// 3. Average age of male & Female
	public void avgAgeOfMaleFemale(List<Employee> employeeList);
	
	// 4. Details of highest paid emp
	public void highSalEmp(List<Employee> employeeList);
	
	// 5. Name of employees who joined after 2015
	public void joinedYear2015(List<Employee> employeeList);		
	
	// 6. count number of emp in each dept
	public void noOfEmpInEachDept(List<Employee> employeeList);
	
	// 7. avg sal of each detpt
	public void avgSalEachDept(List<Employee> employeeList);
	
	// 8. yougest male in IT
	public void youngMaleInIT(List<Employee> employeeList);
	
	// 9. Most exp in org
	public void maxExpInPersonOrg(List<Employee> employeeList);
	
	// 10. How many male & female in Infra
	public void countMaleFemaleInInfra(List<Employee> employeeList);
			
	// 11. male & female avg sal
	public void maleFemaleAvgSal(List<Employee> employeeList);
	
	// 12. List emp names of all dept
	public void empNameAllDept(List<Employee> employeeList);
	
	// 13. avg sal & total sal of org
	public void avgSalTotalSal(List<Employee> employeeList);
			
	// 14. separate age >= 25 & < 25
	public void filterAge25(List<Employee> employeeList);
	
	// 15. oldest emp in org, his age and dept
	public void displayOldestEmp(List<Employee> employeeList);
			
}