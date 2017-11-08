package com.qna.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsLineCharacters {

	public static void readFileAndPrintCounts(String fileName) throws FileNotFoundException {
		 
		int totalWords = 0;
		int totalLines = 0;
		int totalCharacters = 0;
 
		String line;
 
		// Read file contents
		// The try-with-resources statement is a try statement that declares one or more resources. A resource is an
		// object that must be closed after the program is finished with it. The try-with-resources statement ensures
		// that each resource is closed at the end of the statement.
		BufferedReader br  =null;
		//try (BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt")))
		//{
		//Above updated example in JDK 7, which use try-with-resources new feature to close file automatically.
		try 
		{
			br= new BufferedReader(new FileReader(fileName));
			
			crunchifyLog("========== File Content ==========");
 
			// read each line one by one
			while ((line = br.readLine()) != null) {
				crunchifyLog(line);
				totalLines++;
 
				// ignore multiple white spaces
				String[] myWords = line.replaceAll("\\s+", " ").split(" ");
				//String[] myWords = line.split(" ");
				
				for (String s : myWords) {
					totalCharacters += s.length();
				}
 
				totalWords += myWords.length;
 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	   finally {
		try {
			if (br != null)br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
		crunchifyLog("\n========== Result ==========");
 
		crunchifyLog("* Total Characters: " + totalCharacters);
		crunchifyLog("* Total Words: " + totalWords);
		crunchifyLog("* Toal Lines: " + totalLines);
	}
 
	private static void crunchifyLog(String string) {
		System.out.println(string);
	}
 
	public static void main(String[] args) {
		try {
			String fileName = "F://WORK//Goals//Q&A//src//crunchify.txt";
			
			readFileAndPrintCounts(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}