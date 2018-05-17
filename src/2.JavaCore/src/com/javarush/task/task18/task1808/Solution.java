package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String файл1=bufferedReader.readLine();
        String файл2=bufferedReader.readLine();
        String файл3=bufferedReader.readLine();
     try (
         FileInputStream inputStream1 =  new FileInputStream(файл1);
         FileOutputStream inputStream2 = new FileOutputStream(файл2);
        FileOutputStream inputStream3 = new FileOutputStream(файл3);
     ){
         bufferedReader.close();

        if (inputStream1.available()>0) {
            byte[] buffer = new byte[inputStream1.available()];
            int count = inputStream1.read(buffer);
             int len = buffer.length % 2 > 0 ? buffer.length / 2 + 1 : buffer.length / 2;
            inputStream2.write(buffer, 0, len);
             inputStream3.write(buffer, len, buffer.length - len);
         }   }

    }
}
