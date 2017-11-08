package com.vinod.string;

public class SearchWordInTheText {
	private boolean searchWord(String text, String match )
	{	String[] sentence = text.split(" ");
		
/*	int indx = text.indexOf(match);
    System.out.println("Index: "+indx); 	
    		
    		String subStr = text.substring(7);
    		System.out.println("New String: "+subStr);*/
    
    		String[] sentence1= text.split(" ");
    		
    		//System.out.println("New :"+sentence1[0]);
    		
		for(String word: sentence)
		{
		    if(word.equals(match)){
		    	
		    	System.out.println(text.indexOf(match));
		        return true;
		    } 
		}
		return false;
	}
	
	public static void main(String[] args) {
	SearchWordInTheText obj = new SearchWordInTheText();
	boolean b= obj.searchWord("I will come and meet you at the 123woods","come");
	System.out.println(b);
	}
}
