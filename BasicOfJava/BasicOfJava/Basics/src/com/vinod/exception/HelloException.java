package com.vinod.exception;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class HelloException {

	void display()
	{
		
		try {
		
			String i = JOptionPane.showInputDialog(null,"Please enter value");
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
