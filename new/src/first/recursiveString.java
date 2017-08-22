package first;

public class recursiveString {

	public static void main(String[] args) {

		
		String s="abbabba";
		System.out.println(removeDuplicatesOccurance(s));
		
	}
	
/*	public static String removeDuplicate(String s) {
		StringBuilder builder = new StringBuilder();
		char lastchar = '\0';
		for (int i = 0; i < s.length(); i++) {
		  String str = builder.toString();
		  if (!str.equals("")
		      && (str.charAt(str.length() - 1) == s.charAt(i))) {
		    builder.deleteCharAt(str.length() - 1);
		  } else if (s.charAt(i) != lastchar)
		    builder.append(s.charAt(i));
		  lastchar = s.charAt(i);
		}
		
		return builder.toString();
		}*/
	public static String removeDuplicatesOccurance(String s) {
		if(s.isEmpty()) 
		{
		return s;
		}
		char[] buf = s.toCharArray();
		char lastChar =buf[0];

									  
									   
		int z=1;

		for(int i=1;i<buf.length;i++)
		{
		if(z > 0 && buf[i]==buf[z-1])
		{
		lastChar=buf[z-1];
		while(z > 0 && buf[z-1] == lastChar)
		{
		z--;
		}
		}else if(buf[i] == lastChar)
		{
		// don't copy to z
		}else
		{
		buf[z++]=buf[i];
		}
		}
		return new String(buf,0,z);
		}


}
