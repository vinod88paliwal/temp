package com.ds;

public class SinglyLinkedListNode {

	public int value;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int value) {

          this.value = value;
          next = null;
    }

	@Override
	public String toString() {
		return "SinglyLinkedListNode [value=" + value + ", next=" + next + "]";
	}
    
}
