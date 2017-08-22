package Input_output;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream file=new FileOutputStream("F:\\Java\\BufferedOut.txt");
		BufferedOutputStream bout=new BufferedOutputStream(file);
		String s="Mohit\nKumar";
		byte b[]=s.getBytes();
		try {
			bout.write(b);
			bout.flush();
			file.close();
			System.out.println("Success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
