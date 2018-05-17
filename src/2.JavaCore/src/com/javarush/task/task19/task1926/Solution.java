package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = buffirReaderFileInpStrReder();
    while (bufferedReader.ready()){
        System.out.println(revers(bufferedReader.readLine()));
    }
    bufferedReader.close();
    }


    public static BufferedReader buffirReaderFileInpStrReder() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReaderFile =
                new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();

        return bufferedReaderFile;
    }
    public static  String revers (String s){
        String res = "";
        for (int i = s.length()-1; i>=0 ; i--) {
            res+=s.charAt(i);
        }
    return  res;}
}
