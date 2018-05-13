package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
 static {
     labels.put(1.25,"Name1");
     labels.put(2.25,"Name2");
     labels.put(3.25,"Name3");
     labels.put(4.25,"Name4");
     labels.put(5.25,"Name5");

 }
    public static void main(String[] args) {


        System.out.println(labels);
    }
}
