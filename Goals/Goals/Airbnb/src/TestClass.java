import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

class TestClass {
	
    public static void main(String args[] ) throws Exception {

		// Read input from stdin and provide input before running

		BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
		String line = bread.readLine();
		int no = Integer.parseInt(line);
		if (no <= 0) {
			System.out.println("Not OK");
		}
		for (int i = 0; i < no; i++) {
			line = bread.readLine();
			System.out.println(checkIt(line));
		}
	}
	
	public static String checkIt(String str) {

		if (str.length() <= 0 || str == null) {
			return "Not OK";
		}
		HashSet<Character> charSet = new HashSet<Character>();
		char strToArray[] = str.toCharArray();

		int count = 0;
		int maxCount = 1;
		Character lastChar = strToArray[0];
		charSet.add(lastChar);

		int index = 1;

		for (; index < strToArray.length; index++) {

			if (lastChar == strToArray[index]) {
				count++;

			} else {
				count++;
				maxCount = (count > maxCount) ? count : maxCount;
				count = 0;
				break;
			}

			lastChar = strToArray[index];
		}

		for (; index < strToArray.length; index++) {

			if (lastChar == strToArray[index]) {
				count++;

			} else if (lastChar != strToArray[index] && !charSet.contains(strToArray[index])) {

				if (count > 0 && count > maxCount) {
					return "Not OK";
				}
				charSet.add(strToArray[index]);
				count = 1;
			} else {
				return "Not OK";
			}

			lastChar = strToArray[index];
		}

		if (charSet.size() == 3)
			return "OK";
		else
			return "Not OK";
	}
}