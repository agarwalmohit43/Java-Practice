package after;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class multiple implements Serializable{

	int age=40;
	public static void main(String[] args) {

		multiple obj=new multiple();
		obj.age=20;
		writeObjToFile(obj);
		try {
			readFromObj();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static void readFromObj() throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("F:\\Java\\multiple.txt"));
		try{
			//Construct the ObjectInputStream object
            
            Object obj = null;
            
            while ((obj = ois.readObject()) != null) {
                
                if (obj instanceof multiple) {
                
                    System.out.println(((multiple)obj).age);
                }
                
            }
            
		}finally {
            //Close the ObjectInputStream
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
	}
	private static void writeObjToFile(multiple obj) {

		try{
			FileOutputStream fos=new FileOutputStream("F:\\Java\\multiple.txt", true);
			ObjectOutputStream objectOS=new ObjectOutputStream(fos);
			objectOS.writeObject(obj);
			objectOS.flush();
			objectOS.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
