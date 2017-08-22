package check;

import java.util.UUID;

public class uuidgenerator {

	public static void main(String[] args) {

		UUID uuid=UUID.randomUUID();
		//System.out.println("Generated UUID = " + uuid.toString());
		
		
		String a=uuid.toString();
		String[] b=a.split("");
		System.out.println("UUID Type: "+a.getClass().getName());
		System.out.println("\nUUID: "+ a + " \nLength: "+b.length);
	}

}
