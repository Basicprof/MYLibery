package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream =  new FileInputStream(bufferedReader.readLine());
        byte b =Byte.MAX_VALUE;
        while (inputStream.available() > 0){
            int b1 = inputStream.read();
            if(b1<b){b = (byte) b1;}
        }
        inputStream.close();
        System.out.println(b);
    }
}
