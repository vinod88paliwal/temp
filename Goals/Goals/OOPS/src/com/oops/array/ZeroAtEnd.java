package com.oops.array;

public class ZeroAtEnd {

	public static void main(String args[]) {
    	
           int a[] = { 1, 0, 2, 1, 0, 3, 0, 0, 5 };

           // calling the function to move the zero at end
           sortZeroAtEnd(a);

           // displaying sorted array(zero at front)
           for (int i = 0; i < a.length; i++) {
                  System.out.print(a[i] + " ");
           }
    }

    // function to move zero at the end
    private static void sortZeroAtEnd(int[] a) 
    {
           int len = a.length;
           for (int i = 0; i < len-1; i++) 
           {
              for (int j = 0; j < len - 1 - i; j++) 
              {
            //if a[j] is zero and a[j+1] is not zero then swap both elements             
                        if (a[j] == 0 && a[j] < a[j + 1]  ) 
                        {
                              /* int temp = a[j + 1];
                               a[j + 1] = a[j];
                               a[j] = temp;*/
                        	
                        			//OR
                        	 int temp = a[j];
                             a[j] = a[j+1];
                             a[j+1] = temp;
                        	
                        }
                  }
           }
    }
}