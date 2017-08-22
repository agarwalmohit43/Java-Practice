package Input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fileinput {

	public static void main(String[] args) throws FileNotFoundException {
		
	try{
		FileInputStream file=new FileInputStream("F:\\Java\\Mohit.txt");
	
		int a=file.read();
		System.out.println((char)a);
		file.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
