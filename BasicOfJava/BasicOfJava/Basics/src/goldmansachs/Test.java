package goldmansachs;

public class Test {

	public Test(Object o){
		System.out.println("Test(Object o)");
	}
	/*public Test(Object[] o1){
		System.out.println("Test(Object[] o1)");
	}
	*/
	public Test(int i){
		System.out.println("Test(int i)");
	}
	/*public Test(String s){
		System.out.println("Test(String s)");
	}*/
	
	           //or
	public Test(Integer inObj){
		System.out.println("Test(Integer inObj)");
	}
	
	public static void main(String[] args) {
		
		Test obj = new Test(null);
// If we comment either Test(Integer inObj) or Test(String s) then it works fine other wise
// it will have compile time error.
	}
	
}
