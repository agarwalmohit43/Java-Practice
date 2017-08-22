package Input_output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader file=new FileReader("F:\\Java\\Filewriter.txt");
		try {
			int i=0;
			while((i=file.read())!=-1){
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
