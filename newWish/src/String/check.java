package String;

import java.util.Scanner;

public class check {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String s=in.nextLine();
		System.out.println(s);
		
		
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		System.out.println(sb);
	}

}
