package inputOutputSCJP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileWriter {

	static BufferedReader br;
	
	public static void main(String[] args) {
		
		String stringToWrite;
		
		try{
			File file=new File("F:\\Java\\scjp\\fileWriter.txt");
			br=new BufferedReader(new InputStreamReader(System.in));
			if(!(file.exists()))
			{
				System.out.println("File Not Found Creating New");
				file.createNewFile();
			}else{
				System.out.println("File Exists");
				System.out.println("Enter the Sentence to insert in File located at -> "+file);
				stringToWrite=br.readLine();
				writeToFile(file,stringToWrite);
				readFromFile(file);
				writeToFilePrintWriter(file);
				readFromBufferedReader(file);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void readFromBufferedReader(File file) {

		try{
			FileReader fr=new FileReader(file);
			br=new BufferedReader(fr);
			String data;
			while((data=br.readLine())!=null){
				System.out.println(data);
			}
			br.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void writeToFilePrintWriter(File file) {

		try{
			PrintWriter pw=new PrintWriter(file);
			pw.write("Hi! Using PrintWriter");
			pw.flush();
			pw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private static void readFromFile(File file) {
		char[] character=new char[50];
		int size=0;
		try{
			FileReader fr=new FileReader(file);
			size=fr.read(character);
			System.out.println(size);
			for(char c: character){
				System.out.print(c);
			}
			System.out.println();
			
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private static void writeToFile(File file, String stringToWrite) {
		
		try{
			java.io.FileWriter fw=new java.io.FileWriter(file);
			fw.write(stringToWrite);
			fw.flush();
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
