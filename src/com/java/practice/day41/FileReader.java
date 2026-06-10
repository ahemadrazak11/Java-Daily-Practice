package com.java.practice.day41;

import java.io.File;
import java.io.IOException;
public class FileReader {

	public static void main(String[] args) throws IOException{
		
		File f = new File("D:\\\\Qspider\\\\Core Java\\\\Java-Practice\\\\src\\\\com\\\\java\\\\practice\\\\day41\\\\NewFile.txt");
		
		System.out.println(f.createNewFile());
		
		
	}
}
