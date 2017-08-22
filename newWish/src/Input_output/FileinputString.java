package Input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileinputString {

	public static void main(String[] args)throws FileNotFoundException {

		try{
			FileInputStream file=new FileInputStream("F:\\Java\\FileString.txt");
			int i=0;
			while((i=file.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			file.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}

}
