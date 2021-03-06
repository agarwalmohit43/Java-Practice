package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedPattern {

	static String outputString;
	public static void main(String[] args) {

		Pattern pattern =Pattern.compile("ab");
		Matcher matcher= pattern.matcher("abaaaba");
		while(matcher.find()){
			System.out.println(matcher.start()+" "+matcher.group());
		}
		
		outputString = new StringBuilder("aaaazzaaaaab44bbbbbbbcddggaaybbbby").reverse().toString();
		System.out.println("Before: "+outputString);
		outputString = outputString.replaceAll("(.)(?=.*\\1)", "");
		System.out.println("After: "+outputString);
		outputString = new StringBuilder(outputString).reverse().toString();
		System.out.println(outputString);
	}

}
