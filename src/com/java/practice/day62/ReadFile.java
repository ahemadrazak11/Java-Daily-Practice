package com.java.practice.day62;

import java.io.*;

public class ReadFile {
	
	public static void main(String[] args) throws IOException{
		
		
		
		File f = new File("D:\\Qspider\\Core Java\\Java-Practice\\src\\com\\java\\practice\\day62\\IOFile.txt");
		
		FileReader fileReader = new FileReader(f);
		
		int data;
		
		
		// this method read line by line.
		
//		while((data = fileReader.read()) != -1 ) {
//			System.out.print((char) data);
//		}
		
		
		
		BufferedReader buffereReader = new BufferedReader(fileReader); // this take the object of FileReader Class.
		
		
		
		String line;
		
		while((line = buffereReader.readLine()) != null) {
			System.out.println(line);
		}
		
		
		
		
	}

}
