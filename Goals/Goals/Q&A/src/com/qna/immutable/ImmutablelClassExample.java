package com.qna.immutable;

import java.util.*;

public final class ImmutablelClassExample {
	 
    private final int id;
    private  String name;
    private final HashMap<String,String> testMap;
     
    /**
     * Constructor performing Deep Copy
     * @param i
     * @param n
     * @param hm
     */
     
    public ImmutablelClassExample(int i, String n, Map<String,String> hm){
        System.out.println("Performing Deep Copy for Object initialization");
        this.id=i;
        this.name=n;
        HashMap<String,String> tempMap=new HashMap<String,String>();
        
        for (Map.Entry<String, String> entry : hm.entrySet()) {
        	tempMap.put(entry.getKey(), entry.getValue());
        }
        
        this.testMap=tempMap;
    }
     
     
    /**
     * Constructor performing Shallow Copy
     * @param i
     * @param n
     * @param hm
     */
    
  /*  public FinalClassExample(int i, String n, HashMap<String,String> hm){
        System.out.println("Performing Shallow Copy for Object initialization");
        this.id=i;
        this.name=n;
        this.testMap=hm;
    }
    */
     
    /**
     * Accessor function for mutable objects
     */
    public HashMap<String, String> getTestMap() {
        //return testMap;
        return (HashMap<String, String>) testMap.clone();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
    /**
     * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
     * @param args
     */
    public static void main(String[] args) {
    	
        HashMap<String, String> h1 = new HashMap<String,String>();
        h1.put("1", "first");
        h1.put("2", "second");
         
        String s = "original";
        int i=10;
         
        ImmutablelClassExample ce = new ImmutablelClassExample(i,s,h1);
         
        //Lets see whether its copy by field or reference
        System.out.println(s==ce.getName());
        System.out.println(h1 == ce.getTestMap());
        //print the ce values
        System.out.println("ce id:"+ce.getId());
        System.out.println("ce name:"+ce.getName());
        System.out.println("ce testMap:"+ce.getTestMap());
        //change the local variable values
        i=20;
        s="modified";
        h1.put("3", "third");
        //print the values again
        System.out.println("ce id after local variable change:"+ce.getId());
        System.out.println("ce name after local variable change:"+ce.getName());
        System.out.println("ce testMap after local variable change:"+ce.getTestMap());
         
        HashMap<String, String> hmTest = ce.getTestMap();
        hmTest.put("4", "new");
         
        System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());
 
    }
 
    
}