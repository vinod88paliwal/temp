package com.datastructure;

import java.util.Scanner;

public class QueueDemo {

	private int size;
	private int front = -1;
	private int rear = -1;
	private Integer[] queArr;

	public QueueDemo(int size) {
		this.size = size;
		queArr = new Integer[size];
	}

	public void insert(int item) {
		if (rear == size - 1) 
			System.out.println("queue is overflow");

		 else if (front == -1) {
			rear++;
			queArr[rear] = item;
			front = rear; // or front++;
		} else {
			rear++;
			queArr[rear] = item;
		}
		System.out.println("Front: "+front+" Rear: "+rear);
	}

	public void delete() {
		if (front == -1) {
			System.out.println("queue is underflow");

		} else if (front == rear) {
			System.out.println("removing " + queArr[front]);
			queArr[front] = null;
			front--;
			rear--;
		} else {
			System.out.println("removing " + queArr[front]);
			queArr[front] = null;
			for (int i = front + 1; i <= rear; i++) {
				queArr[i - 1] = queArr[i];

			}
			rear--;
		}
		System.out.println("Front: "+front+" Rear: "+rear);
	}

	public void display() {
		if (front == -1)
			System.out.println("queue is empty");
		else {
			System.out.println("queue is:");
			for (int i = front; i <= rear; i++) {
				System.out.print(queArr[i] + "\t");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("queue test using array");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter size of queue array");
		int size = scan.nextInt();
		
		QueueDemo que = new QueueDemo(size);
		char ch;
		do {

			System.out.println("\nQueue operations \n");
			System.out.println("1. insert");
			System.out.println("2. delete");
			int choice = scan.nextInt();
			System.out.println("Choice: "+choice);
			
			switch (choice) {
			case 1:
				System.out.println("enter integer element to insert");
				que.insert(scan.nextInt());
				break;

			case 2:
				que.delete();
				break;
			}

			que.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
			System.out.println("CH: "+ch);
		} while (ch != 'N' || ch != 'n');

	}

}
