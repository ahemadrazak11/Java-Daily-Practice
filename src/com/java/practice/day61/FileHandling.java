package com.java.practice.day61;

import java.io.*;

public class FileHandling {
	
	
	public static void main(String[] args) throws IOException{
		
		File f = new File("C:\\Users\\Ahemad raza\\OneDrive\\Desktop\\IO");
		
//		// 1. file creating
//		if(f.createNewFile()) {
//			System.out.println(f.getName() + " New File Ctreated Successfully...!");
//		}
//		else {
//			System.out.println("File already exist...!");
//		}
		
		
		// 2. file writing.
		
		
		if (f.mkdir()) {
		    System.out.println("Directory created");
		}
		
	}

}
