package com.addi;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Employee> employeesSorted = new TreeSet<Employee>(new EmpNameComp());
		
		employeesSorted.add(new Employee("Mohan",33));
		employeesSorted.add(new Employee("Addi",55));
		employeesSorted.add(new Employee("Deepak",01));
		
		
			Iterator<Employee>empIt=	employeesSorted.iterator();
		
			while (empIt.hasNext()) {
				Employee emp = (Employee) empIt.next();
				System.out.println("EmpName: "+emp.getEmpName()+" : EmpId: "+emp.getEmpId());
			}
		
	}
	
}
