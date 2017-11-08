import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoOfUnorderedPair {
	public static void main(String[] args) {
		
		BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			String readLine = bred.readLine();
			String inputStr[] = readLine.split(" ");
			
			Integer noOFNodes = Integer.parseInt((inputStr[0]));
			Integer noOFEdges = Integer.parseInt((inputStr[1]));
			
			for (int i = 0; i < noOFEdges; i++) {
				bred.close();
			}

			int totalNoOfEdges = ((noOFNodes - 1) * (noOFNodes - 2)) / 2;

			System.out.println(totalNoOfEdges);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}