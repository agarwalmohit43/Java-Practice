package String;
import java.lang.*;

public class basic {

	public static void main(String[] args) {
		char ch[]={'m','o','h','i','t'};
		String s=new String(ch);
		System.out.println(s);
		
		String ss="Mohit";
		String yy = ss+s;
		System.out.println(yy);
		
		
		String check =" ";
		if(check.isEmpty())
		{
			System.out.println("Empty");
		}
		
		if(check.equals("")){
			System.out.println("is blank");
		}
		
	}
}
