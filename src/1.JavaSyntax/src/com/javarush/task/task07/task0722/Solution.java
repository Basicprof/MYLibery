package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> arr = new ArrayList<String>();
       String s;
        do {
            s = reader.readLine();
      if(!s.equals("end")) arr.add(s);
       }
       while (!s.equals("end"));
      //напишите тут ваш код
    for (String i:arr) System.out.println(i);
    }
}