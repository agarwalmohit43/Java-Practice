package Input_output;
import java.io.*;


public class Fileoutput {

	public static void main(String[] args) throws IOException {

		try {
			FileOutputStream file=new FileOutputStream("F:\\Java\\Mohit.txt");
			file.write(65);
			System.out.println("Writing Success");
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
