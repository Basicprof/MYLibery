package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
           Index();
           String();
        Unik();
        Array();
        Class();
        Null();
        Negative();
        Format();
        StringIndex();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);

        }
    }
    private static void Index () {
        int[] a = new int[1];
        try {
            int z = a[10];
        } catch (ArrayIndexOutOfBoundsException e1) {
            exceptions.add(e1);
        }
    }
    private static void String() {

        try {
            File file = new File("file");
            FileReader fr = new FileReader(file);
            
        } catch (FileNotFoundException e3) {
            exceptions.add(e3);
        }
    }
    private static void Unik() {
        try {
            int kol[] = {1, 2};
            int d=kol[9];
        } catch (ArrayIndexOutOfBoundsException e4) {
            exceptions.add(e4);

        }
    }
    private static void Array() {
        try {
            Object x[] = new String[3];
            x[0] = 10;
        } catch (ArrayStoreException e5) {
            exceptions.add(e5);
        }
    }


    private static void Class() {
        Boolean s = null;
        try {
            Object x = 20;
            s =  (boolean)x;
        } catch (ClassCastException e6) {
            exceptions.add(e6);
        }
    }

    private static void Null() {
        try {
            Integer str = null;
            System.out.println(str.toString());
        } catch (NullPointerException e7) {
            exceptions.add(e7);
        }
    }

    private static void Negative() {
        int s = -120;
        try {
            int[] asd = new int[s];

        } catch (NegativeArraySizeException e8) {
            exceptions.add(e8);
        }

    }

    private static void Format() {
        try {
            int num = Integer.parseInt("Danya");
            System.out.println(num);
        } catch (NumberFormatException e9) {
            exceptions.add(e9);
        }

    }

    private static void StringIndex() {
        try {
            String str = "Nenal";
            System.out.println(str.length());
            char c = str.charAt(5);
            c = str.charAt(40);
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e11) {
            exceptions.add(e11);
        }

    }
}



