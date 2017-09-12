package inputOutputSCJP;

import java.io.File;
import java.io.Serializable;

import javax.swing.text.AttributeSet.ColorAttribute;



public class FileCreation {

	int a=5;
	
	public static final void main(String[] args) {

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
