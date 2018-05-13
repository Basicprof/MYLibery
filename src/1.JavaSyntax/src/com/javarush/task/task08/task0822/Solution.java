package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int a= Integer.MAX_VALUE;
        for (Integer s:array ) if(s<a)a=s;
        return a;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List <Integer> integ = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N ; i++) {
           integ.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return integ;
    }
}
