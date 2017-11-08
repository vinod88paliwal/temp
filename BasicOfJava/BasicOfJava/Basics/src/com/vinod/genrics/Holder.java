package com.vinod.genrics;
/**
 * Generic Holder for holding contents of different object type
 * Generic in Java eliminates casting required while calling get(index) from client code
 * @param <T>
 */
class Holder<T>{
    private T[] contents;
    private int index = 0;
    
    @SuppressWarnings("unchecked")
	public Holder(int size){
      //contents = new T[size]; //compiler error - generic array creation
        contents = (T[]) new Object[size]; //workaround - casting Object[] to generic Type
    }
 
    public void add(T content){
        contents[index] = content;
    }
 
    public T get(int index){
        return contents[index];
    }
}
