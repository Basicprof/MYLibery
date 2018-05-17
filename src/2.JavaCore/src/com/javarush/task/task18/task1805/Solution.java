package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        InputStream inputStream =  new FileInputStream(bufferedReader.readLine());
        bufferedReader.close();
        List<Byte> list= new ArrayList();
    while (inputStream.available() > 0)list.add((byte) inputStream.read());
         inputStream.close();


        int counter;
        do {
            counter = 0;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    byte temp = list.get(i);
                     list.set(i,list.get(i+1));
                    list.set(i + 1, temp);
                    counter++;
                }
            }
        }
        while (counter > 0);
       byte as=0;
        for (byte y:list){

            if(y!=as){System.out.print(y+" ");as=y;}
        }

    }
}




