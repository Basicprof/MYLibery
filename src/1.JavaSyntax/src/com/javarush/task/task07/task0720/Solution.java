package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<String>();
         Integer N = Integer.parseInt(reader.readLine());
         Integer M = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N ; i++) {
            arr.add(reader.readLine());
        }

        for (int i = 0; i < M ; i++) {
            arr.add(arr.get(i));
        }
        for (int i = 0; i < M ; i++) {
            arr.remove(0);
        }

        for (String i:arr)System.out.println(i);
        }
        //напишите тут ваш код
    }

