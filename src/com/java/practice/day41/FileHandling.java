package com.java.practice.day41;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {

	public static void main(String[] args) throws IOException{
		
		File f = new File("D:\\Qspider\\Core Java\\Java-Practice\\src\\com\\java\\practice\\day41\\Data.txt");
		
		System.out.println(f.createNewFile()); // createNewFile() method is present in the File class.
		
		// FileWriter fw = new FileWriter(f); it will overide the file.
		
		 FileWriter fw = new FileWriter(f, true); // append mode is on it will not override the file.
		
		 // write() method is present in the FileWriter class.
		 
		fw.write("This is the file handling examle, \nIn file handling we use classes like \nFile, \nFileWriter, \nFileReader");
		
		// flush() method is present in the FileWriter class.
		fw.flush();
		
		FileReader fr = new FileReader(f);
		
		// read() method is present in the FileReader class.
		int data = fr.read();
		
		StringBuffer strData = new StringBuffer();
		
		while(data != -1)
		{
			strData.append((char) data);
			
			data = fr.read();
		}
		
		System.out.println(strData);
		
	}
}




// question create a method whihc accept two file and it will copy the data from one file to another file;