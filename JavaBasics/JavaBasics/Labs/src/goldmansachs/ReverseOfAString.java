package goldmansachs;
public class ReverseOfAString {
	public String reverse(String str) {
		char[] string = str.toCharArray();
	
		int len = string.length - 1;
		System.out.println(len);
		int middleElement = len / 2;
		
		System.out.println(middleElement);

		for (int i = 0; i <= middleElement; i++) {
			char temp = string[i];
			string[i] = string[len - i];
			string[len - i] = temp;
		}
		return new String(string);
	}
	public static void main(String argc[]) {
		ReverseOfAString r = new ReverseOfAString();
		String rev = r.reverse("VINODP");
		System.out.println(rev);
	}
}