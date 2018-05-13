package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
           bufferedReader.close();
       BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(name1));
        BufferedWriter bufferedWriterFile = new BufferedWriter(new FileWriter(name2));
        String s = "";


        while ((s = bufferedReaderFile.readLine()) != null) {
   bufferedWriterFile.write(s.replace('.','!'));// Заменяем символ в строке
  }bufferedReaderFile.close();
        bufferedWriterFile.close();
}}
