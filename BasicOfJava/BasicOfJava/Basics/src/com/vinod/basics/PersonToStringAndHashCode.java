package com.vinod.basics;

public class PersonToStringAndHashCode {
	
	    private int id;
	    private String firstName;
	    private String lastName;

	    public int getId() { return id; }
	    public void setId(int id) { this.id = id;}

	    public String getFirstName() { return firstName; }
	    public void setFirstName(String firstName) { this.firstName = firstName; }

	    public String getLastName() { return lastName; }
	    public void setLastName(String lastName) { this.lastName = lastName; }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }
	        if (obj == null || obj.getClass() != this.getClass()) {
	            return false;
	        }
	        PersonToStringAndHashCode guest = (PersonToStringAndHashCode) obj;
	        return id == guest.id
	                && ( (firstName != null && firstName.equals(guest.getFirstName())))
	                && ( (lastName != null && lastName .equals(guest.getLastName())));
	    }
	   
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	        result = prime * result + id;
	        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	        return result;
	    }
	  
public static void main(String[] args) {
	
	PersonToStringAndHashCode obj = new PersonToStringAndHashCode();
	obj.id=100; obj.firstName="Mohan"; obj.lastName= null;
	
	PersonToStringAndHashCode obj1 = new PersonToStringAndHashCode();
	obj1.id=100; obj1.firstName="Mohan";obj1.lastName= "kP";
	
	if(obj.equals(obj1))
	{
		System.out.println("Same");
	}
	else {
		System.out.println("not same");
	}
}
	    
	    
}
