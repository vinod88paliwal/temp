package com.vinod.analytical;

public class MissingNumberInArray {

	public static void main(String args[]){

	int a[]={1,2,3,4,5,7,8,9,10};
	
	System.out.println(a.length);;
	
	int asum = 0,sum = 0;
	for(int i=1;i<=10;i++){ //here 10 is last digit
	sum=sum+i;
	}
	System.out.println("Sum: "+sum);
	
	for(int i=0;i<a.length;i++)
	asum=asum+a[i];
	System.out.println("asum: "+asum);
	
	int missnum=sum-asum;
	System.out.println("Missing Number"+missnum);

	
	}
	

	}