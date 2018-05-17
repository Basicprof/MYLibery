package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    ArrayList<String> str = new ArrayList<String>();     //напишите тут ваш код
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     int  shortString = 2147483647;
     int   longString = 0;
    for (int i = 0; i < 10; i++)
        str.add(bufferedReader.readLine());
        for (String s:str){
        if (s.length()<shortString)shortString = s.length();
        if (s.length()>longString)longString = s.length();
                      }
        for (String s:str){
            if (s.length()== shortString){System.out.println(s);break;}
            if (s.length()== longString){System.out.println(s);break;}
        }

    }
}
