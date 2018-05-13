package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      ArrayList<String> str = new ArrayList<String>(); //напишите тут ваш код
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            str.add(bufferedReader.readLine());
        }
        String t;
        for (int i = 0; i < 13 ; i++) {
            t=str.get(4);
            str.remove(4);
            str.add(0,t);
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println(str.get(i));
        }
    }
}
