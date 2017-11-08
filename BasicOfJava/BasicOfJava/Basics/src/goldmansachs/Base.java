package goldmansachs;

public class Base {

	 Base(){}

static class one {
	public one() {
	System.out.println("one defualt");
	}
		 
		 void show(){
			 System.out.println("One = show()");
		 }
	 }
	 
static class Two extends one{

	Two(){ // this is going to stack full.
		one obj = new Two();
    	}
	void show(){
		 System.out.println("Two = show()");
	 }
	 }

public static void main(String[] args) 
{
	one obj = new Two();
	obj.show();
}
}
