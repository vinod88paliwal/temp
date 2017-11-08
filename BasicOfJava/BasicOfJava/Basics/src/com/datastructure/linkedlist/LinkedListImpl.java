package com.datastructure.linkedlist;

public class LinkedListImpl
{

    public static void main(String[] args)
    {
    	LinkedList ll = new LinkedList();
        ll.add(15);
        ll.add (20);
        ll.add (25);
        /*ll.add(300, 3);
        System.out.println(ll);
        System.out.println(ll.get(4));
        System.out.println(ll.remove(2));*/
        System.out.println(ll);
        
        System.out.println("Size: "+ll.size());
    }
}
