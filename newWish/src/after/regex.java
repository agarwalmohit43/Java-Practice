package after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class regex {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String expression = br.readLine();
		String[] expressionSplit= expression.trim().split("[+*/-]");
		for(String elements: expressionSplit){
			System.out.println(elements);
			
			int x=checck(100);
			System.out.print(x);
		}
	}

	private static int checck(int i) {
		if(i<=0)
			return 1;
		return checck(i-1);
	}

}
