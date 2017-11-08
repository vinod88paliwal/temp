package com.vinod.analytical;

public class SortArrayWithoutAPI {

	  public int[] sortToArray(int []a)
	   {
	       int len=a.length;
	       int temp;
	       for(int i=0;i<len-1;i++)
	       {
	               if(a[i] < a[i+1])
	               {
	            	   temp=a[i];
	                   a[i]=a[i+1];
	                   a[i+1]=temp;
	               }
	       }
	       return a;
	   }
	   public static void main(String argd[])
	   {
	         int a[]=new int[] {5,9,8,2,1};

	         SortArrayWithoutAPI s=new SortArrayWithoutAPI();
	       int b[]= s.sortToArray(a);
	      
	       for(int i=0;i<b.length;i++)
	        {
	            System.out.println("sort array is " + b[i]);
	        }
	   }
	   
}
