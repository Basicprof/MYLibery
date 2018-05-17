package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte [] b = new byte[fileInputStream.available()];
         fileInputStream.read(b);
         fileInputStream.close();
         int kol=0;
         for (int i = 0;b.length > i; i++) {
            if((b[i]>64&&b[i]<91)||(b[i]>96&&b[i]<123))kol++;
        }
        System.out.println(kol);
   }
}
