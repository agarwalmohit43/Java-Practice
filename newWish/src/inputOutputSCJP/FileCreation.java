package inputOutputSCJP;

import java.io.File;

public class FileCreation {

	public static void main(String[] args) {

		try{
			boolean newFile = false;
			File file=new File("F:\\Java\\scjp\\one.txt");
			System.out.println(file.exists());
			newFile = file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
