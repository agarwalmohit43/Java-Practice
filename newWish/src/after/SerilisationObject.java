package after;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerilisationObject implements Serializable {

	public static void main(String[] args)  throws Exception {

		Scanner kb = new Scanner(System.in);// this will be used later 
        PData data = null;
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
         
        out = new ObjectOutputStream(new  FileOutputStream("PData.dat",true));
        data = new PData();
        data.set(101,"Jimmy");
        data.show();
        out.writeObject(data);
       // out.flush();
        data.set(102,"Tony");
        data.show();
        out.writeObject(data);
        //out.flush();
        data.set(103,"cyrus");
        data.show();
        out.writeObject(data);
        //out.flush();
        out.close();
         
        in = new ObjectInputStream(new FileInputStream("PData.dat"));
        PData temp;
        temp = (PData) in.readObject();
        temp.show();
        temp = (PData) in.readObject();
        temp.show();
        temp = (PData) in.readObject();
        temp.show();
        in.close();
	}

}
