package com.vinod.genrics;

import java.util.ArrayList;

/**
 * Generics and Array doesn't gel very well, Java doesn’t allow Generics array like E[]
 * @author Vinod Paliwal
 */
public class GenericVsArray {
 
    public static void main(String args[]){
      Holder<Integer> numbers = new Holder(10);
     // Holder<int> numbers = new Holder(10); //compiler error - unexpected type required: reference found:int
     
      numbers.add(101);
      System.out.println("Get: " + numbers.get(0));
    
           
    }

 
}
