package com.vinod.string;

public class SearchWordInTheText {

	private boolean searchWord(String text, String match )
	{
		System.out.println("Length of sentence: "+text.length());
		
		String[] sentence = text.split(" ");
		
	int indx = text.indexOf(match);
    System.out.println("Index of word: "+indx); 	
    		
		for(String word: sentence)
		{
		    if(word.equals(match)){
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
