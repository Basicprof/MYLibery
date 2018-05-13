package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
      ArrayList<Integer> arr = new ArrayList<Integer>();
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int num=1;
        int nums=0;
        int numsi =0;
        for (int i = 0; i < arr.size(); i++) {
              if(i==0) nums = arr.get(i);
              else {
                  if (nums == arr.get(i)){num++;nums =arr.get(i);if (numsi<num) numsi=num;}
                  else {if (numsi<num) numsi=num;num=1;nums =arr.get(i);}
              }
         }

   System.out.println(numsi);
    }
}