package com.addi;

import java.util.Comparator;

public class EmpNameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		String empName1 = emp1.getEmpName().toUpperCase();
		String empName2 = emp2.getEmpName().toUpperCase();
		
		//ascending order
		return empName1.compareTo(empName2);
	
		//descending order
		//return empName2.compareTo(empName1);
	}	
	
}
