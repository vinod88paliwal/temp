package com.vinod.exception;

import javax.swing.JOptionPane;

public class ThrowClass {

	void display()
	{
	
	try {
		
		String s = JOptionPane.showInputDialog(null,"Please enter value");
	
	} catch (NumberFormatException e) {
	
		throw e;
	}
	
	
		
	}
	
	
}
