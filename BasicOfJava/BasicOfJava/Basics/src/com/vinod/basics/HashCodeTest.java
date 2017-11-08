package com.vinod.basics;

public class HashCodeTest {

	int empId;
	String name="";
	
	public HashCodeTest() {}
				
	public HashCodeTest(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	@Override
	public int hashCode(){
        int result = 10;
        result = result * new Integer(String.valueOf(empId)).intValue();
        return result;
    }
	@Override
	public boolean equals(Object o) {
        if (o == this)
        return true;
        if (!(o instanceof HashCodeTest))
        return false;
        
        HashCodeTest emp = (HashCodeTest)o;
        return emp.empId == empId && emp.name == name;
        } 

	public static void main(String[] args) {
		
		HashCodeTest obj1 = new HashCodeTest();
		HashCodeTest obj2 = new HashCodeTest();

	if(obj1.equals(obj2)){
		System.out.println("equals true ");//equals true
	}else {
		System.out.println("equals false");
	}
	 int x =obj1.hashCode();
	 int y= obj2.hashCode();
	
	 if(x == y){
		 System.out.println("hashcode is same "+x+" -- "+y); //hashcode is same 0 -- 0
	 }else {
		 System.out.println("hashcode is not same");
	}
	
	HashCodeTest obj3 = new HashCodeTest(10,"Mohan");
	HashCodeTest obj4 = new HashCodeTest(10,"Sohan");
		
		if(obj3.equals(obj4)){
			System.out.println("equals true");
		}else {
			System.out.println("equals false");//equals false
		}
		 int p =obj3.hashCode();
		 int q= obj4.hashCode();
		
		 if(p == q){
			 System.out.println("hashcode is same"+p+" -- "+q);//hashcode is same100 -- 100
		 }else {
			 System.out.println("hashcode is not same"+p+" -- "+q);
		}
	}
}
