package Input_output;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {

		FileWriter file=new FileWriter("F:\\Java\\Filewriter.txt");
		try{
			file.write("MOHIT Agarwal");
			file.flush();
			file.close();
			System.out.println("Wirtten Successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
