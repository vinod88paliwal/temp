package com.vinod.test;

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int processData(ArrayList<String> array) {
        
    	Map<String, String> map = new HashMap<String, String>();
    	
    	int high=0;
    	String db =""; String ver="";
    	
    	for(int i=0 ; i< array.size(); i++){
    		
    	String str = array.get(i);
    	String[] strArray =  str.split(",");
    	db = strArray[2];
    	ver = strArray[3];
    	map.put(ver, db);    	 	
    	
    	}
    	
    	Set<String> keys = map.keySet();
    	
    	for (String string : keys) {
			
    		String val2= map.get(string);
    		
    			if(val2.equals(db))
    			{
    				high++;
    			}
    	}
    	
    	return high;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (!line.isEmpty()) // Ignore blank lines
                	
                    inputData.add(line);
            }
            int retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
