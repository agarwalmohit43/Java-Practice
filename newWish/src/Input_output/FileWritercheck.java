package Input_output;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritercheck {

	public static void main(String[] args) {

		try {
			FileWriter fw=new FileWriter("F:\\Java\\filewritercheck.txt");
			fw.write("Hi H Mohit JI");
			fw.close();
			System.out.println("Success");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
