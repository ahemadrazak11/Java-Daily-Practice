package com.java.practice.day63;

import java.io.*;

public class DeserializationDemo {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        FileInputStream fis =
                new FileInputStream("D:\\Qspider\\Core Java\\Java-Practice\\src\\com\\java\\practice\\day63\\student.txt");

        ObjectInputStream ois =
                new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println(s.id);
        System.out.println(s.name);

        ois.close();
        fis.close();
    }
}