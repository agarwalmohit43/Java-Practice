package String;

public class StringFunction {

	public static void main(String[] args) {

		String string="I am Mohit Kumar, I love am exploring new things";
		String string2="	Great!";
		String string3="";
		String string4="I am Mohit Kumar, i love exploring new things";

		System.out.println("Character at "+string.charAt(40));
		System.out.println("Length of string "+string.length());
		
		System.out.println("Substring at "+string.substring(5));
		System.out.println("Substring at "+string.substring(5,40));
		
		System.out.println("Boolean  "+string.contains("N"));
		System.out.println("Join  "+string.join("*", string,string2));
		
		System.out.println("Equal  "+string.equals(string4));
		System.out.println("Equal IgnoreCases "+string.equalsIgnoreCase(string4));		

		System.out.println("Empty  "+string3.isEmpty());
		
		System.out.println("Concat  "+string.concat(string2));
		
		System.out.println("Replace  "+string.replace("new", "tech"));
		System.out.println("Replace  "+string.replace("o", "jio"));
		System.out.println("Replace  "+string.replaceAll("o", "hello"));
		System.out.println("After Repalce original string  "+string);
		
		System.out.println("IndexOf  "+string.indexOf('m'));
		System.out.println("IndexOf  "+string.indexOf("Mohit"));
		System.out.println("IndexOf  "+string.indexOf('m', 5));
		System.out.println("IndexOf  "+string.indexOf("Mohit", 5));
		
		System.out.println("Trim:"+string2.trim());
		System.out.println("ValueOf  "+string.valueOf(15.5));
		
		System.out.println("Compareto  "+string.compareTo(string3));

		System.out.println("EndsWith  "+string.endsWith("s"));
		System.out.println("EndsWith  "+string.endsWith("things"));
		System.out.println("EndsWith  "+string.endsWith("new things"));
		
		System.out.println("lastIndexOf  "+string.lastIndexOf('m'));
		System.out.println("lastIndexOf  "+string.lastIndexOf("am"));
		System.out.println("lastIndexOf  "+string.lastIndexOf('m', 20));
		System.out.println("lastIndexOf  "+string.lastIndexOf("am", 5));






		
		
		

	}

}
