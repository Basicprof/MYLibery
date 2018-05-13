package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       int t = 0;
        for (int i = 0; i < 5 ; i++) {
            strings.add(bufferedReader.readLine());
            if (t < strings.get(i).length())t = strings.get(i).length();
        }
        for (int i = 0; i < strings.size() ; i++) {
            if (t == strings.get(i).length()) System.out.println(strings.get(i));
        }
    }
}
