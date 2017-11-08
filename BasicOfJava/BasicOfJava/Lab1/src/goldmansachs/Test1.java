package goldmansachs;
//Key points : 1. any object variable declared as a final need not to be initialised while declaration
// 2. But if you initialise while declaration(weather object variable or normal variable) then 
 // we can not change the value of that variable.
// 3. we can initialise object variable only in constructor not in any setter or normal method.

public class Test1 implements Comparable<Test1> {

	 private final int fin;
	private final Integer i;
	//private final Integer i = new Integer(0);
	//private final Object obj;

	public Test1(Integer i, int fin) {
		this.i = i;
		this.fin = fin;
		System.out.println(this.i+" ---- "+ fin);
	}

	@Override
	public int compareTo(Test1 arg0) {
		
		return this.i -((Test1)arg0).i;
	}
	
	public static void main(String[] args) {
		
		Integer i = new Integer(0);
		Test1 obj = new Test1(i,22);
	}
	
	
	
}

