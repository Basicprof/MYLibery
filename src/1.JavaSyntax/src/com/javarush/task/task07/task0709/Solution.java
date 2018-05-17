package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer t =  2147483647;
        for (int i = 0; i < 5 ; i++) {
            strings.add(bufferedReader.readLine());
            if (t > strings.get(i).length())t = strings.get(i).length();
        }
        for (int i = 0; i < strings.size() ; i++) {
            if (t == strings.get(i).length()) System.out.println(strings.get(i));
        }
    }
    }

