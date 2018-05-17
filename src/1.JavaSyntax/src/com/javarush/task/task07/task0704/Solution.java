package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int [] num = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < num.length ; i++) {
            num[i] = Integer.parseInt(bufferedReader.readLine());


        }
        int t;
        for (int i = 0; i < num.length/2 ; i++) {
            t = num[i];
            num[i]= num[num.length-1-i];
            num[num.length-1-i]=t;
        }
        for  (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]);
        }
    }  //напишите тут ваш код
    }


