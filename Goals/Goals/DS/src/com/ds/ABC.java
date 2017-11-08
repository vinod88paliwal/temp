package com.ds;

import java.awt.Choice;

import javax.swing.JOptionPane;

public class ABC {

	public static void addFirst() {

    	System.out.println("addFirst()");
	}
	
	public static void main(String[] args) {
		
	//	int choice =0;
		String options ="\n 1.Add node \n 0. exit";
		
		int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter ur choice: "+options));
		System.out.println("Choice: "+choice);
		
		do {
			
			switch (choice) {
			case 1: addFirst();			
			break;

			default: break;
			}
			System.out.println("outside");
		} while (choice !=0);
		
		
		
	}
	
}
