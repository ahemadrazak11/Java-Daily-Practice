package com.java.practice.day63;

import java.io.*;

public class SerializationDemo {
	
	public static void main(String[] args)
            throws IOException {

        Student s = new Student(101, "Ahemad");

        FileOutputStream fos =
                new FileOutputStream("D:\\\\Qspider\\\\Core Java\\\\Java-Practice\\\\src\\\\com\\\\java\\\\practice\\\\day63\\\\student.txt");

        ObjectOutputStream oos =
                new ObjectOutputStream(fos);

        oos.writeObject(s);

        oos.close();
        fos.close();

        System.out.println("Object serialized");
    }

}

