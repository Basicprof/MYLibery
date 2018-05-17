package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int maximum =Integer.MIN_VALUE;
        int minimum= Integer.MAX_VALUE;
        for (int a:arr) {
         if (a>maximum)maximum=a;
         if (a<minimum)minimum=a;
        }
        //напишите тут ваш код

        System.out.print(maximum+" "+minimum);

    }
}
