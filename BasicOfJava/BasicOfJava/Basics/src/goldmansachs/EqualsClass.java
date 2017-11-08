package goldmansachs;

public class EqualsClass {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = s3.intern();
		
		System.out.println("S1 : "+s1+", s2: "+s2+", s3: "+s3 +", s4 : "+s4 );
		
		System.out.println("s1 == s2 : "+ (s1 == s2));
		System.out.println("s1.equals(s2) : "+ (s1.equals(s2)));
		
		System.out.println("s1 == s3 : "+ (s1 == s3));
		System.out.println("s1.equals(s3) : "+ s1.equals(s3));
		
		System.out.println("s3 == s4 : "+ (s3 == s4));
		System.out.println("s3.equals(s4) : "+ s3.equals(s4));
		
		System.out.println("s2 == s4 : "+ (s2 == s4));
		System.out.println("s2.equals(s4) : "+ s2.equals(s4));
		
		
		
	}
	
	
}
