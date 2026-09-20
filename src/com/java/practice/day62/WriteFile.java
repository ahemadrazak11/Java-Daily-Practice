package com.java.practice.day62;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) throws IOException {


		
		
		File f = new File("D:\\Qspider\\Core Java\\Java-Practice\\src\\com\\java\\practice\\day62\\IOFile.txt");
		
		
		if(f.createNewFile()) {
			
			System.out.println("File Created Successfully...!");
		}
		else
		{
			System.out.println("File is not created or already exist...!");
			
		}
		
		//FileWriter fileWriter = new FileWriter(f); // this is used to overwrite the file.
		
		FileWriter fileWriter = new FileWriter(f, true); // this is used to append the text do not overwrite.
		
		
		
		fileWriter.write("\nThis is Appended Text");
			
		System.out.println("File Written Succefully...!");

		
		fileWriter.close();
	}
	

}
