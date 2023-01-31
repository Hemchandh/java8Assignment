package com.tcsjava8Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(101, "Hari", 28, "Male", "IT", 2021, 25000));
		employeeList.add(new Employee(102, "Jay", 27, "Male", "Infra", 2019, 27000));
		employeeList.add(new Employee(104, "Sai", 26, "Male", "HR", 2021, 29000));
		employeeList.add(new Employee(103, "Sri", 25, "Male", "Marketing", 2021, 35000));
		employeeList.add(new Employee(106, "Krishna", 24, "Male", "IT", 2020, 35000));
		employeeList.add(new Employee(105, "Ram", 38, "Male", "HR", 2021, 45000));
		employeeList.add(new Employee(107, "Raj", 32, "Male", "IT", 2022, 25000));
		employeeList.add(new Employee(108, "Satya", 48, "Male", "HR", 2023, 25000));
		employeeList.add(new Employee(109, "Chakri", 26, "Male", "Marketing", 2021, 35000));
		employeeList.add(new Employee(110, "Rakesh", 32, "Male", "Infra", 2010, 45000));
		employeeList.add(new Employee(111, "Tarun", 32, "Male", "IT", 2011, 35000));
		employeeList.add(new Employee(112, "Chitra", 33, "Female", "HR", 2012, 25000));
		employeeList.add(new Employee(113, "Teja", 25, "Female", "HR", 2021, 25000));
		employeeList.add(new Employee(114, "Ramya", 31, "Female", "Infra", 2018, 35000));
		employeeList.add(new Employee(115, "Sam", 27, "Female", "IT", 2015, 40000));

		EmployeeService employeeService = new EmployeeServiceImpl();

		// 1. How many female & male employees
		employeeService.totalMaleFemaleEmps(employeeList);

		// 2. Print all department names
		employeeService.displayDepartmentNames(employeeList);

		// 3. Average age of male & Female
		employeeService.avgAgeOfMaleFemale(employeeList);

		// 4. Details of highest paid emp
		employeeService.highSalEmp(employeeList);

		// 5. Name of employees who joined after 2015
		employeeService.joinedYear2015(employeeList);

		// 6. count number of emp in each dept
		employeeService.noOfEmpInEachDept(employeeList);

		// 7. avg sal of each detpt
		employeeService.avgSalEachDept(employeeList);

		// 8. yougest male in IT
		employeeService.youngMaleInIT(employeeList);

		// 9. Most exp in org
		employeeService.maxExpInPersonOrg(employeeList);

		// 10. How many male & female in Infra
		employeeService.countMaleFemaleInInfra(employeeList);

		// 11. male & femal avg sal
		employeeService.maleFemaleAvgSal(employeeList);

		// 12. List emp names of all dept
		employeeService.empNameAllDept(employeeList);

		// 13. avg sal & total sal of org
		employeeService.avgSalTotalSal(employeeList);

		// 14. separate age >= 25 & < 25
		employeeService.filterAge25(employeeList);

		// 15. oldest emp in org, his age and dept
		employeeService.displayOldestEmp(employeeList);

	}
}
