package com.ds;

import javax.swing.JOptionPane;

public class SinglyLinkedList {

	private SinglyLinkedListNode head;
    private SinglyLinkedListNode tail;

    public SinglyLinkedList() {

          head = null;
          tail = null;

    }
    
    public static void addFirst() {

    	System.out.println("addFirst()");
    /*	SinglyLinkedListNode newNode = getData();
    	
        if (newNode == null)
              return;
        else {
              if (head == null) {
                    newNode.next = null;
                    head = newNode;
                    tail = newNode;
              } else {
                    newNode.next = head;
                    head = newNode;
              }
        }
        
        System.out.println("Data added: "+ newNode);*/
  }
    
     private SinglyLinkedListNode getData(){
    	  
    	  return new SinglyLinkedListNode(10);
      }
    
    public static void main(String[] args)
    {
    	/*SinglyLinkedList obj = new SinglyLinkedList();
    	
		String options ="\n 1.Add node \n 8. exit";
	
		int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter ur choice: "+options));
		System.out.println("Choice: "+choice);*/
		
		int  choice=-1;
		do
		{
			choice=showoptionandgetchoice();
			dosomejob(choice);
		}while(choice!=0);
		
		
		
	}
    private static int showoptionandgetchoice() {
		// TODO Auto-generated method stub
		String options =
			"\n 1. Add node" +
			"\n 2.  Register" +
			"\n 0. Exit" +
			"\n Enter the choice";
		int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter ur choice: "+options));
		
		return choice;
	}

    private static void dosomejob(int choice) {
		// TODO Auto-generated method stub
		if(choice == 2)
		{
			
			
			
		}
		else if(choice ==1)
		{
			
		}
	}
	private static void addLast() {
		System.out.println("addLast()");
		
	}
    
}