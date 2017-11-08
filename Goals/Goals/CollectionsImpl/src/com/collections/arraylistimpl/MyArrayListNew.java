package com.collections.arraylistimpl;

import java.util.Arrays;

public class MyArrayListNew<E> {

	private Object elementData[];
	private int size = 0;

	public MyArrayListNew(){
		elementData = new Object[4];
	}
	
	 public MyArrayListNew(int initialCapacity){
    	 if (initialCapacity < 0)
             throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
 	
    	 this.elementData = new Object[initialCapacity];
    	
    }
	 
	public void add(E e ){
		
			ensureCapa(size+1);
			elementData[size++] = e;
	}

	private void ensureCapa(int newSize) {
		
		int currentSize = elementData.length;
		
		if(newSize > currentSize)
		{
			elementData = Arrays.copyOf(elementData, currentSize*2);
			System.out.println("Current Size: "+currentSize);
		}
	}

	public E get(int index){
		if(index >=size || index < 0){
			 throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
		}
		return (E) elementData[index];
	}
	
	public E remove(int index){
		if(index >=size || index < 0){
			 throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		Object obj=	elementData[index];
		elementData[index] = null;
		
		while (index < size) {
			elementData[index] = elementData[index+1];
			elementData[index+1]=null;
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
			sb.append(elementData[count]);
			count++;
			if(count < size)
				sb.append(",");
		}
		
		return "["+ sb +"]" ;
	}
	
	
}
