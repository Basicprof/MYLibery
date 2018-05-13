package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        char[] arr;
        do {
            s = bufferedReader.readLine();
            for (int i = 0; i < s.length(); i++) {
                  if( ".".equals(String.valueOf(s.charAt(i))) ){
              print( Double.parseDouble(s) ); break;}
            }
            if(Short.parseShort(s)>0&&Short.parseShort(s)<128){print(Short.parseShort(s));break;}

                if(Integer.parseInt(s)<=0&&Integer.parseInt(s)>=128){print(Integer.parseInt(s));break;}
                      else print(s);
        }
        while (!s.equals("exit"));
   bufferedReader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
