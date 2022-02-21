package com.digital_nomads.exceptions;

import com.digital_nomads.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws Exception{


//            try {
//                FileWriter myWriter = new FileWriter("filename.txt");
//                myWriter.write("Files in Java might be tricky, but it is fun enough!");
//                myWriter.close();
//                System.out.println("Successfully wrote to the file.");
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                System.out.println("Finally is ");
//            }
//        FileWriter myWriter = new FileWriter("filename.txt");
//                myWriter.write("Files in Java might be tricky, but it is fun enough!");
//                myWriter.close();
//                System.out.println("Successfully wrote to the file.");
        int a[]=new int[4];
        System.out.println(Demo1.test(a));
  // 2.      throw new Exception("This is my exception");//сами придумали ошибки

        //int age=19;
        //throw new Exception ("Access denied");
        //}else{
        //System.out.println("Access granted");
        //}
    }

    public static boolean test (int b[])throws Exception{
        int a[]=new int[b.length];
        return false;
    }
}
