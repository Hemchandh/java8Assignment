package com.tcsjava8Assignment;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void totalMaleFemaleEmps(List<Employee> employeeList) {
		try {
			System.out.println(employeeList.stream()
					.collect(Collectors.groupingBy(gender -> gender.getGender(), Collectors.counting())));
		} catch (NullPointerException e) {
			System.out.println("EXCEPTION CAUGHT - NULL");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void displayDepartmentNames(List<Employee> employeeList) {
		List<String> departmentList = employeeList.stream().map(employee -> employee.getDepartment()).distinct()
				.collect(Collectors.toList());
		System.out.println(departmentList);
	}

	@Override
	public void avgAgeOfMaleFemale(List<Employee> employeeList) {
		Map<String, Double> avgGenderAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgGenderAge);
	}

	@Override
	public void highSalEmp(List<Employee> employeeList) {
		System.out.println(
				employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

	}

	@Override
	public void joinedYear2015(List<Employee> employeeList) {
		System.out.println(employeeList.stream().filter(yearJoined -> yearJoined.getYearJoined() >= 2015)
				.map(Employee::getName).collect(Collectors.toList()));

	}

	@Override
	public void noOfEmpInEachDept(List<Employee> employeeList) {
		System.out.println(
				employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

	}

	@Override
	public void avgSalEachDept(List<Employee> employeeList) {
		System.out.println(employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))));

	}

	@Override
	public void youngMaleInIT(List<Employee> employeeList) {
		System.out.println(employeeList.stream()
				.filter(employee -> employee.getDepartment() == "IT" && employee.getGender() == "Male")
				.collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))));

	}

	@Override
	public void maxExpInPersonOrg(List<Employee> employeeList) {
		System.out.println(
				employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearJoined))));

	}

	@Override
	public void countMaleFemaleInInfra(List<Employee> employeeList) {
		System.out.println(employeeList.stream().filter(employee -> employee.getDepartment() == "Infra")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));

	}

	@Override
	public void maleFemaleAvgSal(List<Employee> employeeList) {
		System.out.println(employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));

	}

	@Override
	public void empNameAllDept(List<Employee> employeeList) {
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)));

	}

	@Override
	public void avgSalTotalSal(List<Employee> employeeList) {
		DoubleSummaryStatistics salaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(salaryStatistics);
		System.out.println("Average sal in org: " + salaryStatistics.getAverage());
		System.out.println("Total sal of org: " + salaryStatistics.getSum());
	}

	@Override
	public void filterAge25(List<Employee> employeeList) {
		System.out.println(
				employeeList.stream().filter(employee -> employee.getAge() >= 25).collect(Collectors.toList()));
		System.out
				.println(employeeList.stream().filter(employee -> employee.getAge() < 25).collect(Collectors.toList()));

	}

	@Override
	public void displayOldestEmp(List<Employee> employeeList) {

		try {
			if (employeeList.size() >= 1) {

				Optional<Employee> result = employeeList.stream()
						.collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge)));

				if (result.isPresent()) {
					Employee oldestEmp = result.get();
					System.out.println("Oldest employee: " + oldestEmp.getName() + ", Age: " + oldestEmp.getAge()
							+ ", Department: " + oldestEmp.getDepartment());
				} else
					throw new EmptyResultException();
			} else
				throw new EmptyEmployeeListException();
		} catch (NullPointerException e) {
			System.out.println("Exception caught - null");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
