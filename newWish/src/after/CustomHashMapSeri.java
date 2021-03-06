package after;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class CustomHashMapSeri implements Serializable {

	int age;
	int dateOfBirth;
	static CustomHashMapSeri objCustom;
	public static void main(String[] args) throws ClassNotFoundException, IOException {

		//1st object
		CustomHashMapSeri obj=new CustomHashMapSeri();
		obj.age = 10;
		obj.dateOfBirth = 28;
		
		System.out.println("Before Writing to File");
		System.out.println("hashCode: "+obj.hashCode());
		System.out.println("Age: "+obj.age);
		System.out.println("DOB: "+obj.dateOfBirth);

		//2nd Object
		CustomHashMapSeri obj2=new CustomHashMapSeri();
		obj2.age = 5;
		obj2.dateOfBirth = 5;
		
		System.out.println("Before Writing to File");
		System.out.println("hashCode: "+obj2.hashCode());
		System.out.println("Age: "+obj2.age);
		System.out.println("DOB: "+obj2.dateOfBirth);
		
		
		//Writing object to file
		//writeObjToFile(obj);
		//writeObjToFile(obj2);
		
		//reading object form file
		readobjectFromFile(obj.hashCode());
		
		//
		ArrayList<Object> al=new ArrayList<Object>();
		//al=readFromFile();
		
		ArrayList<CustomHashMapSeri> al2=new ArrayList<CustomHashMapSeri>();
		//al2=readFromFileOO();
		System.out.print(al2.size());
	}
	private static ArrayList<CustomHashMapSeri> readFromFileOO() throws IOException {
		CustomHashMapSeri obj=new CustomHashMapSeri();
		ArrayList<CustomHashMapSeri> al=new ArrayList<CustomHashMapSeri>();
		FileInputStream fis = new FileInputStream("F:\\Java\\CustomHashMapSeri.txt");
		ObjectInputStream objectIS = new ObjectInputStream(fis);
		try{
			while(fis.available()>0){
				obj=(CustomHashMapSeri) objectIS.readObject();
				al.add(obj);
				System.out.println("Reading File");
				System.out.println("hashCode: "+obj.hashCode());
				System.out.println("Age: "+obj.age);
				System.out.println("DOB: "+obj.dateOfBirth);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			objectIS.close();
		}
		
		return al;
	}
	
	private static ArrayList<Object> readFromFile() throws IOException, ClassNotFoundException {
		ArrayList<Object> al=new ArrayList<Object>();
		FileInputStream fis=new FileInputStream("F:\\Java\\CustomHashMapSeri.txt");
		ObjectInputStream objectInputS=new ObjectInputStream(fis);
		while(true){
			try 
			{
				Object obj= objectInputS.readObject();
				if(obj != null)
					al.add(obj);
			} catch (EOFException e) 
			{
				return al;
				
			}finally{
				objectInputS.close();
			}
		}
	}
	private static void readobjectFromFile(int hashCode) {

		CustomHashMapSeri obj=new CustomHashMapSeri();
		ArrayList<CustomHashMapSeri> al=new ArrayList<CustomHashMapSeri>();
		try{
			FileInputStream fis = new FileInputStream("F:\\Java\\CustomHashMapSeri.txt");
			ObjectInputStream objectIS = new ObjectInputStream(fis);
				obj=(CustomHashMapSeri) objectIS.readObject();
				
				System.out.println("Reading File");
				System.out.println("hashCode: "+obj.hashCode());
				System.out.println("Age: "+obj.age);
				System.out.println("DOB: "+obj.dateOfBirth);
				
				obj=(CustomHashMapSeri) objectIS.readObject();
				
				System.out.println("Reading File");
				System.out.println("hashCode: "+obj.hashCode());
				System.out.println("Age: "+obj.age);
				System.out.println("DOB: "+obj.dateOfBirth);
				objectIS.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private static void writeObjToFile(CustomHashMapSeri obj) {

		try{
			FileOutputStream fos=new FileOutputStream("F:\\Java\\CustomHashMapSeri.txt", true);
			ObjectOutputStream objectOS=new ObjectOutputStream(fos);
			objectOS.writeObject(obj);
			objectOS.flush();
			objectOS.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age*dateOfBirth;
	}
	
	
	
	

}
