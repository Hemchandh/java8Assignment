package com.tcsjava8Assignment;

public class EmptyEmployeeListException extends RuntimeException {
	
	@Override
	public String toString() {
		return "EXCEPTION - Employee List is Empty";
	}
}
