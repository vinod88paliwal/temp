package com.vinod.string;

public class StringMemoryLeak {

	public static void main(String[] args) {
		
	String listOfStockSymbolsOnNYSE = "This subString Example shows how to divide String";

		//calling String(string) constructor
		String apple = new String(listOfStockSymbolsOnNYSE.substring(1,5));
		
		System.out.println(apple);

	}
	
	
/*  public String(String original) {
        ...

        if (originalValue.length &gt; size) {
            // The array representing the String is bigger than the new
            // String itself.  Perhaps this constructor is being called
            // in order to trim the baggage, so make a copy of the array.
            int off = original.offset;
            v = Arrays.copyOfRange(originalValue, off, off+size);

        } else {

            // The array representing the String is the same
            // size as the String, so no point in making a copy.
            v = originalValue;
        }
    ...

    }
*/
	
	
	
	
}
