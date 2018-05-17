package com.javarush.task.task18.task1801;

import java.io.*;
import java.*;
/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream  inputStream = new FileInputStream(bufferedReader.readLine());
        byte b = 0;
        while (inputStream.available() > 0){
            int b1 = inputStream.read();
             if(b1>b){b = (byte) b1;}
        }
        inputStream.close();
        System.out.println(b);
    }
}
