package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      int [] arr = new int[20];
      int [] arrmin = new int[10];
      int [] arrmin2 = new int[10];
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length ; i++) {
               arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < arrmin.length ; i++) {
            arrmin[i]= arr[i];
        }
        for (int i = 0; i < arrmin2.length ; i++) {
            arrmin2[i] = arr[i+arrmin.length];
        }
        for (int i = 0; i < arrmin2.length ; i++) {
           System.out.println(arrmin2[i]);
        }

    }
}
