package Input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileoutputString {

	public static void main(String[] args) throws FileNotFoundException {

		try{
		FileOutputStream file=new FileOutputStream("F:\\Java\\FileString.txt");
		String s="Mohit Agarwal";
		byte b[]=s.getBytes();
		file.write(b);
		System.out.println("Success..: "+b);
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
