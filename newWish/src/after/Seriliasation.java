package after;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seriliasation implements Serializable {

	 int height,weight;
	 static Seriliasation obj;
	 
	public static void main(String[] args) {

		
		obj=new Seriliasation();
		obj.height=5;
		obj.weight=10;
		writeToFile(obj);
		readFromFile();
		
		
	}
	
	
	private static void writeToFile(Seriliasation obj2) {

		try
		{
			FileOutputStream fos=new FileOutputStream("F:\\Java\\Serilisation.txt");
			ObjectOutputStream objectOS=new ObjectOutputStream(fos);
			objectOS.writeObject(obj2);
			objectOS.flush();
			objectOS.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	private static void readFromFile() {

		try 
		{
			FileInputStream fis=new FileInputStream("F:\\Java\\Serilisation.txt");
			ObjectInputStream objectInputS=new ObjectInputStream(fis);
			obj=(Seriliasation) objectInputS.readObject();
			objectInputS.close();
			System.out.println("Object hascode: "+obj.hashCode());
			System.out.println(obj.height+" "+obj.weight);
			
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
