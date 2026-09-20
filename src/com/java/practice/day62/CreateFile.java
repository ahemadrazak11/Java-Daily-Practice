package com.java.practice.day62;


import java.io.*;

public class CreateFile {
	
	public static void main(String[] args) throws IOException{
		
		File createFile = new File("D:\\Qspider\\Core Java\\Java-Practice\\src\\com\\java\\practice\\day62\\IOFile.txt");
		
		
		if(createFile.createNewFile()) {
			
			System.out.println("File Created Successfully...!");
		}
		else
		{
			System.out.println("File is not created or already exist...!");
			
		}
		
		
		System.out.println("Before Delete");
		
		String isExist= (createFile.exists())? "Yes": "No";
		
		System.out.println("File Exist or Not? = " + isExist);
		
		createFile.delete();
		
		System.out.println("After Delete");
		
		isExist= (createFile.exists())? "Yes": "No";
		
		System.out.println("File Exist or Not? = " + isExist);
		
		
	}

}
