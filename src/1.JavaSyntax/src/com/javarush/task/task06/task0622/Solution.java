package com.javarush.task.task06.task0622;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         ArrayList<Integer>num = new ArrayList<Integer> ();

        for (int i = 0; i <5 ; i++) {

            num.add(Integer.parseInt(reader.readLine()));
        } //напишите тут ваш код
           Collections.sort(num);
        for (Integer nums : num) System.out.println(nums);
    }
}
