package com.addi;

public class Employee {

	private String empName;
	private int empId;
	
	public Employee(String empName, int empId) {
	
		this.empName = empName;
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
}
