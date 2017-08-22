package newWish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedreader {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("E");
		int a=br.read();
		System.out.println(a);
		System.out.println("E");
		String b=br.readLine();
		System.out.println(b);
		
	}

}
