package com.collections.arraylistimpl;

import java.util.Arrays;

public class MyArrayListNew<E> {

	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];

	public MyArrayListNew(){
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public void add(E e ){
		
		if(size == elements.length){
			ensureCapa();
		}
		elements[size++] = e;
	}

	private void ensureCapa() {
		elements = Arrays.copyOf(elements,elements.length*2);
	}

	public E get(int index){
		if(index >=size || index < 0){
			 throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (E) elements[index];
	}
	
	public E remove(int index){
		if(index >=size || index < 0){
			 throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		Object obj=	elements[index];
		elements[index] = null;
		
		while (index < size) {
			elements[index] = elements[index+1];
			elements[index+1]=null;
			index++;
		}
		size--;
		
		return (E) obj ;
	}
	
	public int size(){
		return size;
	}

	@Override
	public String toString() {
		int count =0;
		StringBuilder sb = new StringBuilder();
		
		while (count< size) {
			sb.append(elements[count]);
			count++;
			if(count < size){
				sb.append(",");
			}
		}
		
		return "["+ sb +"]" ;
	}
	
	
}
