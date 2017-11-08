package com.vinod.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class ListClass {

	public static void main(String[] args) {
		
		List l =new ArrayList();
		l.add(4);
		l.add("hello");
		l.add(5);
		
		Iterator it = l.iterator();
		
	while (it.hasNext()) {
		Object object = (Object)it.next();
		System.out.println(object);
		
	}
		
		
	}
	
}
