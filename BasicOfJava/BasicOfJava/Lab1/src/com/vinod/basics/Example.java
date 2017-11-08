package com.vinod.basics;

public class Example extends Employee {

	public static void main(String args[]) 
	{
int choice = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Enter your choice"));
		
		Employee e = getObject(choice);
		
		if (e instanceof Employee)
			System.out.println("e pointing to Employe object");
		else if (e instanceof Example)
			System.out.println("e pointing to Example object");
	}

	private static Employee getObject(int choice) {
		Employee temp = null;
		if (choice == 1)
			temp = new Employee();
		else if (choice == 2)
			temp = new Example();
		return temp;
	}
}
