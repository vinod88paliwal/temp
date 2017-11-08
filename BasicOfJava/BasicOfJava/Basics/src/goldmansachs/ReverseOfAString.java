package goldmansachs;

public class ReverseOfAString {
	public String reverse(String str) {

		char[] charArr = str.toCharArray();
		int len = charArr.length - 1;
		int middleElement = len / 2;
		System.out.println("Length: " + len + " Middle: " + middleElement);

		for (int i = 0; i <= middleElement; i++) {
			char temp = charArr[i];
			charArr[i] = charArr[len - i];
			charArr[len - i] = temp;
		}
		return new String(charArr);
	}

	public static void main(String argc[]) {
		ReverseOfAString r = new ReverseOfAString();
		String rev = r.reverse("VINODP MOHAN");
		System.out.println(rev);
	}
}