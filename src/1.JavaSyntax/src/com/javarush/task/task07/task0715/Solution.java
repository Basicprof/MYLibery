package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new  ArrayList<String>();
         arr.add("мама");
         arr.add("мыла");
         arr.add("раму");
        for (int i = 0; i < arr.size(); i++) {
          if (!arr.get(i).equals("именно"))arr.add(i+1,"именно");
        }

        for (String s:arr){
            System.out.println(s);
        }
       }
    }

