package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        InputStream inputStream =  new FileInputStream(bufferedReader.readLine());
        bufferedReader.close();
        List<Byte> list = new ArrayList();

        while (inputStream.available() > 0)list.add((byte) inputStream.read());
        inputStream.close();
        byte a = Byte.MAX_VALUE;
        for (byte b:list){
            byte s =0;
            for (byte b2:list){
                if(b==b2)s++; }
            if(s<a)a=s;
        }
        List <Byte> list1 = new ArrayList<>();
        for (byte bb:list) {
            byte s = 0;
            for (byte bbs : list) {
                if (bb == bbs) s++;
            }
            if (s == a && !list1.contains(bb)) list1.add(bb);
        }
        for (byte y:list1){

            System.out.print(y+" ");
        }

    }
}



