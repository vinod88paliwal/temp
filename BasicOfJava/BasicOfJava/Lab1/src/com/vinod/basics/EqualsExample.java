package com.vinod.basics;

public class EqualsExample {

	int eid ;
	String fname;
	String lname;
	
	
		public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsExample other = (EqualsExample) obj;
		if (eid != other.eid)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		return true;
	}
	
	
	public static void main(String[] args) {
		
			
		EqualsExample vinod = new EqualsExample();
		EqualsExample yogesh = new EqualsExample();
		EqualsExample atul = new EqualsExample();
		
		
		
		vinod.setEid(100);
		vinod.setFname("Vinod");
		vinod.setLname("Paliwal");
		
		yogesh.setEid(100);
		yogesh.setFname("Vinod");
		yogesh.setLname("Paliwal");
			
		atul.setEid(300);
		atul.setFname("atul");
		atul.setLname("samadhiya");
		
		
		if(vinod.equals(yogesh))
			System.out.println("same");
		else 
			System.out.println("different");
		
		
		System.out.println(vinod.hashCode());
		System.out.println(yogesh.hashCode());
			
	
	}
	
	
}

