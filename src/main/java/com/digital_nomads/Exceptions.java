package com.digital_nomads;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int a[] = new int[3];
            System.out.println(a[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            // System.err.println("An error occurred");
        } catch (Exception e) {
            System.err.println("Something went wrong");
            ;
        }
        //exceptions-исключения
        //ошибки Rantime-unchecked  compile
        System.out.println("Hello World");

    }
}