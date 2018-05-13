package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<Integer> arr = new ArrayList<Integer>();
       ArrayList<Integer> arr2 = new ArrayList<Integer>();
       ArrayList<Integer> arr3 = new ArrayList<Integer>();
       ArrayList<Integer> arr4 = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        for (int i = 0; i < 20; i++) {
            arr.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (Integer a : arr ){
            if (a%3==0)arr2.add(a);
           if (a%2==0)arr3.add(a);
            if(a%3!=0&&a%2!=0) arr4.add(a);
        }
    printList(arr2);
    printList(arr3);
    printList(arr4);
    }

    public static void printList(List<Integer> list) {
        for (Integer lis : list)System.out.println(lis);
    }
}
