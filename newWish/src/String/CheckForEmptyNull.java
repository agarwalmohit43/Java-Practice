package String;

public class CheckForEmptyNull {

	public static void main(String[] args) {

		String s1="";
		String s2=" ";
		String s3=" mohit";
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.equals(""));
		System.out.println();
		System.out.println(s2.isEmpty());
		System.out.println(s2.equals(null));
		System.out.println(s2.trim().length()>0);
		System.out.println();
		System.out.println(s3.isEmpty());
		System.out.println(s3.equals(null));
		System.out.println();
		System.out.println(s1==s1);
		System.out.println(s1.equals(s1));
	}

}