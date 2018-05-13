package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
     ArrayList <String> str = new ArrayList<String>();
     str.add("Привет");
     str.add("Привет World");
     str.add("Привет Мир");
     str.add("Привет Java");
     str.add("Привет JavaRush");
     System.out.println(str.size());
        for (int i = 0; i < str.size() ; i++) {
            System.out.println(str.get(i));
        }
    }
}
