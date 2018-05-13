package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
      bufferedReader.close();
        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(name));
        ArrayList <String> arrayList = new ArrayList<>();
      while (bufferedReaderFile.ready()){ arrayList.add(bufferedReaderFile.readLine());}
      bufferedReaderFile.close();


             for (String s:arrayList){
              if(provStrok(s)==2)  System.out.println(s);
             }
    }
    public static int provStrok (String s){
        ArrayList <String> arrayList = new ArrayList<>();
        int sum = 0;
        String [] arrStrok=s.split(" ");
        for (int i = 0; i <arrStrok.length ; i++) {

            for (String ss:words){
              if(ss.equals(arrStrok[i]))
             {sum++;

             }
            }

        }
        return sum;}
    }

